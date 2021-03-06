/*
  ____        _      _    ____        _       
 / __ \      (_)    | |  |  _ \      | |      
| |  | |_   _ _  ___| | _| |_) |_   _| |_ ___ 
| |  | | | | | |/ __| |/ /  _ <| | | | __/ _ \
| |__| | |_| | | (__|   <| |_) | |_| | ||  __/
 \___\_\\__,_|_|\___|_|\_\____/ \__, |\__\___|
                                 __/ |        
                                |___/         
  _____                          
 / ____|                         
| (___   ___  _   _ _ __ ___ ___ 
 \___ \ / _ \| | | | '__/ __/ _ \
 ____) | (_) | |_| | | | (_|  __/
|_____/ \___/ \__,_|_|  \___\___|

Author: Joshua Myron Deidre D. Boongaling
Last Edit: 8-02-2015
Edited by: Joshua Myron Deidre D. Boongaling
*/

package com.quickbyte.fims.gui;

import java.awt.*;
import java.awt.event.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.*;



public class FrameComponents extends JFrame{
    
    public final Font headerFont = new Font("Consolas", Font.PLAIN, 30),
                      componentFont = new Font("Verdana", Font.PLAIN, 12);
    
    public final ImageIcon loginBackground = new ImageIcon(getClass().getResource("/com/quickbyte/fims/resources/login_background.jpg")),
                           systemFrameBackground = new ImageIcon(getClass().getResource("/com/quickbyte/fims/resources/systemframe_background.jpg")),
                           searchIcon = new ImageIcon(getClass().getResource("/com/quickbyte/fims/resources/search_icon.png")),
                           logoutIcon = new ImageIcon(getClass().getResource("/com/quickbyte/fims/resources/logout_icon.png")),
                           addUserIcon = new ImageIcon(getClass().getResource("/com/quickbyte/fims/resources/add_icon.png")),
                           optionsIcon = new ImageIcon(getClass().getResource("/com/quickbyte/fims/resources/settings_icon.png")),
                           helpIcon = new ImageIcon(getClass().getResource("/com/quickbyte/fims/resources/help_icon.png")),
                           qbAdminIcon = new ImageIcon(getClass().getResource("/com/quickbyte/fims/resources/admin_icon.png")),
                           addPageBanner = new ImageIcon(getClass().getResource("/com/quickbyte/fims/resources/add_banner.jpg"));;
    
    public final Color themeColor1 = new Color(51, 102, 153),
                       themeColor2 = new Color(255, 153, 0),
                       themeColor3 = new Color(235, 244, 250),
                       themeColor4 = new Color(255, 255, 255);
    
    public final JLabel loginPageBackground = new JLabel(loginBackground),
                        systemPageBackground = new JLabel(systemFrameBackground);
                        
                        
    
    /*public FrameComponents(JFrame frame){

        setTitle("QuickByte Software - Student Management System");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //setSize(getMaximumSize());
        setResizable(false);
        getContentPane().setBackground(themeColor4);
        setVisible(true); 
                                                              
    }*/
    
    public JLabel LabelProperties(JLabel label){

        label.setFont(new Font("Verdana", Font.BOLD, 12));
        
        return label;
    }
    
    public JTextField TextFieldProperties(JTextField textfield){

        textfield.setFont(componentFont);
        
        return textfield;
    }
    
    public JButton ButtonProperties(JButton button){
        
        
        button.setFont(componentFont);
        button.setBorderPainted(false);
        button.setFocusPainted(false);
        button.setBackground(themeColor1);
        button.setForeground(themeColor4);
        button.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseEntered(MouseEvent e){
				
                button.setBackground(themeColor2);
                button.setForeground(Color.BLACK);
                           
            }

            @Override
            public void mouseExited(MouseEvent e) {
                
                button.setBackground(themeColor1); 
                button.setForeground(themeColor4);
                            
            }
        });
        return button;
    }
    
    public JButton ButtonProperties(JButton button, String buttonText){
        
        
        button.setFont(componentFont);
        button.setBorderPainted(false);
        button.setFocusPainted(false);
        button.setBackground(themeColor1);
        button.setForeground(themeColor4);
        button.setVerticalTextPosition(SwingConstants.BOTTOM);
        button.setHorizontalTextPosition(SwingConstants.CENTER);
        button.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseEntered(MouseEvent e){
				
                button.setBackground(themeColor2);
                button.setForeground(Color.BLACK);
                button.setText(buttonText);
                           
            }

            @Override
            public void mouseExited(MouseEvent e) {
                
                button.setBackground(themeColor1); 
                button.setForeground(themeColor4);
                button.setText("");
                            
            }
        });
        return button;
    }
    
    public JLabel DateTimeProperties(JLabel timeLabel){
        
        final DateFormat timeFormat = new SimpleDateFormat("hh:mm:ssa MM-dd-yyyy");
        ActionListener timerListener = new ActionListener(){
            public void actionPerformed(ActionEvent e){
                
                Date date = new Date();
                String time = timeFormat.format(date);
                timeLabel.setText(time);
            }
        };
        
        Timer timer = new Timer(1000, timerListener);
        timer.setInitialDelay(0);
        timer.start();
        
        return timeLabel;
        
    }
}




















































/*
  ____        _      _    ____        _       
 / __ \      (_)    | |  |  _ \      | |      
| |  | |_   _ _  ___| | _| |_) |_   _| |_ ___ 
| |  | | | | | |/ __| |/ /  _ <| | | | __/ _ \
| |__| | |_| | | (__|   <| |_) | |_| | ||  __/
 \___\_\\__,_|_|\___|_|\_\____/ \__, |\__\___|
                                 __/ |        
                                |___/         
  _____                          
 / ____|                         
| (___   ___  _   _ _ __ ___ ___ 
 \___ \ / _ \| | | | '__/ __/ _ \
 ____) | (_) | |_| | | | (_|  __/
|_____/ \___/ \__,_|_|  \___\___|

Author: Joshua Myron Deidre D. Boongaling
Last Edit: 5-30-2015
Edited by: Joshua Myron Deidre D. Boongaling
*/