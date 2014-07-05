//-----------Terms----------//

//  This program is free software: you can redistribute it and/or modify
//  it under the terms of the GNU General Public License as published by
//  the Free Software Foundation, either version 3 of the License, or
//  (at your option) any later version.

//  This program is distributed in the hope that it will be useful,
//  but WITHOUT ANY WARRANTY; without even the implied warranty of
//  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
//  GNU General Public License for more details.

//  You should have received a copy of the GNU General Public License
//  along with this program.  If not, see <http://www.gnu.org/licenses/>.

//  Also add information on how to contact you by electronic and paper mail.

//  If the program does terminal interaction, make it output a short
//  notice like this when it starts in an interactive mode:

//  IMC_calc Copyright (C) 2014  Luiz Sacramento<sacramento.tecnico@hotmail.com>
//  This program comes with ABSOLUTELY NO WARRANTY; for details type `show w'.
//  This is free software, and you are welcome to redistribute it
//  under certain conditions; type `show c' for details.

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class calc extends JFrame implements ActionListener{
    
        
    JButton jb = new JButton("Next"); //instância JButton 
    
    JLabel  jl = new JLabel("Weight"); 
    JLabel  jl2 = new JLabel("Height"); 
     
    JTextField jt = new JTextField(10);
    JTextField jt2 = new JTextField(10); 
    JTextField jt3 = new JTextField(5);
    
    public class controle{
    	private float text;
        private float text2;

            public float control(){
               return(float)getText()/(getText2()*getText2());  
            }

            public float getText(){
               return text;      
            }
            
            public void setText(float text){
                this.text = text;      
            }
            
             public float getText2(){
                return text2;      
            }
            
            public void setText2(float text2){
                this.text2 = text2;      
            }          
            
    }
      
    public void actionPerformed(ActionEvent e){ 
        controle c = new controle();
        
        c.setText(Float.parseFloat(jt.getText()));
        c.setText2(Float.parseFloat(jt2.getText()));
        
        jt3.setText(String.valueOf(c.control()));
    }

    public calc(){
        setLayout(new FlowLayout());

        add(jl);        
        jl.setBounds(10,50,60,20);//f(x) x,y  / ^ v
        add(jt);          
        jt.setBounds(70,30,300,60);  //textfield e label 1
        
        add(jl2);
        jl2.setBounds(10,150,60,20);
        add(jt2);          
        jt2.setBounds(70,130,300,60);  //textfield e label 2
        
        add(jt3); 
        jt3.setBounds(70,200,190,60);         

        setLayout(null);
        add(jb); //inserção do botão
        jb.setBounds(390,200,100,60);

        
        jb.addActionListener(this);         
                  
        
        setTitle("Calc_IMC by: Luiz Carlos");
        setSize(500,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);  
    }
 
    public static void main(String []args){
        calc s = new calc ();
                                             
    }
     
}
