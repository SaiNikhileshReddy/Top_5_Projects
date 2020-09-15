/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trie.Project;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Sai Nikhilesh Reddy <sainikhilaie@gmail.com>
 */

public class LogNavigator {
    
    private long fileLineCount = 0;
    
    public List<TrieNode> Lines;
    
    LogNavigator(){
        this.Lines = new ArrayList<TrieNode>();
    }
    
    public long FileCounter(String filePath){
        
        Path path = Paths.get(filePath);
        
        long fileLineCount = 0;
        
        try{
            fileLineCount = Files.lines(path).parallel().count();
        }catch(IOException e){
            e.printStackTrace();
        }
        
        return fileLineCount;
    }
    
    public void loadData(String filePath) throws FileNotFoundException{
        
        this.fileLineCount = FileCounter(filePath);
        //System.out.println("Lines : "+fileLineCount);
        
        File file = new File(filePath);
        Scanner scan = new Scanner(file);
        
        
        for (int lineNo = 0; lineNo<fileLineCount; lineNo++){
            this.Lines.add(lineNo, new TrieNode(scan.nextLine()));
        }
    }
    
    public List<Integer> searchData(String [] userInput){
        
        List<Integer> foundData = new ArrayList<Integer>();
        
        for (int lineNumber = 0; lineNumber<this.fileLineCount; lineNumber++){
            TrieNode line = this.Lines.get(lineNumber);
            boolean goAhead = true;
            for (String word : userInput) {
                if (!line.search(word)){
                    goAhead = false;
                    break;
                }
            }
            
            if (goAhead){
                foundData.add(lineNumber);
                //System.out.println("{"+lineNumber+"} "+line.Line);
            }
        }
        
        return foundData;
    }
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String filePath = "E:\\Github\\DS-Algorithms-Java\\LogFileAnlaysis-Trie-Dataset\\Application.csv";
        String [] userInput = new String[]{};
        
        LogNavigator LN = new LogNavigator();
               
        LN.loadData(filePath);
                
        List<Integer> foundData = LN.searchData(userInput);
        
        System.out.println("Found Data : " + foundData);
    }
}