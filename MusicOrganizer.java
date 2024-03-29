import java.util.ArrayList;

/**
 * A class to hold details of audio files.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 2011.07.31
 */
public class MusicOrganizer
{
    // An ArrayList for storing the file names of music files.
    private ArrayList<String> files;
        
    /**
     * Create a MusicOrganizer
     */
    public MusicOrganizer()
    {
        files = new ArrayList<String>();
    }
    
    /**
     * Add a file to the collection.
     * @param filename The file to be added.
     */
    public void addFile(String filename)
    {
        files.add(filename);
    }
    
    /**
     * Return the number of files in the collection.
     * @return The number of files in the collection.
     */
    public int getNumberOfFiles()
    {
        return files.size();
    }
    
    /**
     * List a file from the collection.
     * @param index The index of the file to be listed.
     */
    public void listFile(int index)
    {
        boolean validIndex = false;
        if(validIndex(index) == true) {
            String filename = files.get(index);
            System.out.println(filename);
        }
    }
    
    /**
     * Remove a file from the collection.
     * @param index The index of the file to be removed.
     */
    public void removeFile(int index)
    {
        boolean validIndex = false;
        if(validIndex(index) == true) {
            files.remove(index);
        }
    }
    
    public void checkIndex(int index){
        if (files.size()== 0){
            System.out.println("ERROR ya que la coleccion esta vacia");
        }
        else if (!(index >= 0 && index < files.size())){
            System.out.println("valor no valido, entre el 0 y el "+(files.size()-1));
        }               
    }
    
    public boolean validIndex(int index){
        boolean validIndex = false;
        if (index >= 0 && index < files.size()){
            validIndex = true;
        }
        return validIndex;
    }
}
