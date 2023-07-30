package de.jgsoftwares.hql.main;

import de.jgsoftwares.hql.HibernateUtil;
import java.util.Arrays;
import java.util.List;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


public class HQLClient
{

    
    
    
	@SuppressWarnings("unchecked")
	public static void main(String[] args) 
        {
               try
            {
                UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
            } catch (Exception e)
            {
                System.out.print("LookAndFeel Error Nimbus !");
            }//Prep work
		
                
                de.jgsoftwares.hql.main.JFrame jframe = new de.jgsoftwares.hql.main.JFrame();
              

                jframe.setTitle("HQL Query mawi");
                jframe.setVisible(true);
		jframe.setSize(800,600);
                jframe.pack();
        }        
    

}
