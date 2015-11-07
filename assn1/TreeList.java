package trees;
import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;

public class TreeList {
	public static ArrayList<Tree> trees = new ArrayList<Tree>();
	public static HashMap<String, String> species = new HashMap<String, String>();
	public static HashMap<String, Integer> speciesCount = new HashMap<String, Integer>();

	public TreeList(String file) {
		String line = null;
		try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader = 
                new FileReader(file);
            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = 
                new BufferedReader(fileReader);

            Boolean intact = true;
            String[] treeInfo;    
            while((line = bufferedReader.readLine()) != null) {
                treeInfo = line.split(",");
                intact = true;

                if(treeInfo.length == 9) {
                	for(int i = 0; i < treeInfo.length; i++) {
		                if(treeInfo[i].length() == 0) {
		                	intact = false;
		                	break;
		                }
		            }
		            if(intact) {
		            	Tree tree = new Tree(treeInfo[0], treeInfo[1], treeInfo[2], treeInfo[3], treeInfo[4], treeInfo[5], treeInfo[6], treeInfo[7], treeInfo[8]);
		                trees.add(tree);
		            }
                }
            }   
            // Always close files.
            bufferedReader.close();         
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to open file '" + 
                file + "'");                
        }
        catch(IOException ex) {
            System.out.println(
                "Error reading file '" 
                + file + "'");                  
            // Or we could just do this: 
            // ex.printStackTrace();
        }
	}

	public static void species() {
		String file = "species_list.txt";
		String line = null;
		try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader = 
                new FileReader(file);
            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = 
                new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) {
                String[] treeInfo = line.split(" ", 2);
                species.put(treeInfo[0], treeInfo[1]);
            }

            // Always close files.
            bufferedReader.close();         
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to open file '" + 
                file + "'");                
        }
        catch(IOException ex) {
            System.out.println(
                "Error reading file '" 
                + file + "'");                  
            // Or we could just do this: 
            // ex.printStackTrace();
        }
	}

	public static void mostCommon() {
		for(int i = 0; i < trees.size(); i++) {
			if(speciesCount.get(trees.get(i).code()) == null) {
				speciesCount.put(trees.get(i).code(), 1);
			}
			else {
				speciesCount.put(trees.get(i).code(), speciesCount.get(trees.get(i).code()) + 1);
			}
		}

		String most = "";
		String secondMost = "";
		String thirdMost = "";

		int count1 = 0;
		int count2 = 0;
		int count3 = 0;

		for(String species: speciesCount.keySet()) {
			if(speciesCount.get(species) > count1) {
				count3 = count2;
				thirdMost = secondMost;
				count2 = count1;
				secondMost = most;
				count1 = speciesCount.get(species);
				most = species;
			} 
			else if(speciesCount.get(species) > count2) {
				count3 = count2;
				thirdMost = secondMost;
				count2 = speciesCount.get(species);
				secondMost = species;
			}
			else if(speciesCount.get(species) > count3) {
				count3 = speciesCount.get(species);
				thirdMost = species;
			}
		}
		System.out.println(species.get(most) + ": " + count1);
		System.out.println(species.get(secondMost) + ": " + count2);
		System.out.println(species.get(thirdMost) + ": " + count3);
	}
	public static void main(String[] args) {
		TreeList treeList = new TreeList("QueensTree.csv");
		species();
		mostCommon();
	}
}


































