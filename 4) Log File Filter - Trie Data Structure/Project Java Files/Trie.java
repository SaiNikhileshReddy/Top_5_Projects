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
public class Trie {
    
    final int ALPHABET_SIZE = 91;
    
    Trie[] children = new Trie[ALPHABET_SIZE]; 

    boolean isEndOfWord; 

    Trie(){ 
        isEndOfWord = false; 
        for (int i = 0; i < ALPHABET_SIZE; i++) 
                children[i] = null; 
    }
 }