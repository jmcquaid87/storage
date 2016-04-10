/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc241hw01;

/**
 *
 * @author justinmcquaid
 */
import java.util.ArrayList;
public class Storage {
        ArrayList<String> names = new ArrayList<String>();
	public boolean addItem(String s)
	{   
            
                if (s != null)
                {
                names.add(s);
                return true;
                }
                else    {
                    return false;
                }
	}
        public String[] getItems()
        {
            String array[];
            array = names.toArray(new String[names.size()]);
            return array;
        }
        public boolean isFull()
        {
            return false;
        }
        public boolean removeItem(String s)
        {
            if (s != null)
            {
                names.remove(s);
                return true;
            }
            else    {
                return false;
            }
        }

        
}