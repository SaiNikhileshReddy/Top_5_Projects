/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trie.Project;

/**
 *
 * @author Sai Nikhilesh Reddy <sainikhilaie@gmail.com>
 */

public class TrieNode {
    
    String Line;
    String [] LineData;
    Trie root;
    
    TrieNode(String line){
        this.root = new Trie();
        this.Line = line;
        this.LineData = line.split(",");
        
        for (String word : LineData){
            insert(word);
        }
    }
    
    public void insert(String key) { 
        int level; 
        int length = key.length(); 
        int index; 

        Trie pCrawl = root; 

        for (level = 0; level < length; level++) { 
                index = key.charAt(level) - ' '; 
                if (pCrawl.children[index] == null) 
                        pCrawl.children[index] = new Trie(); 

                pCrawl = pCrawl.children[index]; 
        } 
        pCrawl.isEndOfWord = true; 
    } 

    public boolean search(String key) { 
        int level; 
        int length = key.length(); 
        int index; 
        Trie pCrawl = root; 

        for (level = 0; level < length; level++) { 
                index = key.charAt(level) - ' '; 
                
                if (pCrawl.children[index] == null) {
                    return false;
                }
                pCrawl = pCrawl.children[index]; 
        }
        return true; 
    } 
}