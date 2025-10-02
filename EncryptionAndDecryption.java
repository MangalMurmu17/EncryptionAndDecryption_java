import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class EncryptionAndDecryption {
    //operate
    public static void operate(int key)
    {
        //file chooser
        JFileChooser chooser=new JFileChooser();
        chooser.showOpenDialog(null);
        File file=chooser.getSelectedFile();
        try
        {
            //file input stream
            FileInputStream fis=new FileInputStream(file);
            byte [] data=new byte[fis.available()];
            fis.read(data);
            int i=0;
            for(byte b:data)
            {
                System.out.println(data);
                data [i]=(byte) (b^key);
                i++;
            }
            FileOutputStream fos=new FileOutputStream(file);
            fos.write(data);
            fos.close();
            //message after operation
            JOptionPane.showMessageDialog(null,"Done");
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    public static void main(String[] args)
    {
        //creating Frame
        JFrame f=new JFrame();
        f.setTitle("Encrypt and Decrypt");
        f.setSize(400,400);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //creating font
        Font font=new Font("roboto",Font.BOLD,25);
        //creating button
        JButton button=new JButton();
        button.setText("Add Image");
        button.setFont(font);
        //creating text field
        JTextField textfield=new JTextField(10);
        textfield.setFont(font);
        //to call a function when button gets clicked
        button.addActionListener(e->{
            String text=textfield.getText();
            int temp=Integer.parseInt(text);
            operate(temp);
        });
        //set layout for the frame
        f.setLayout(new FlowLayout());
        // add button in the frame
        f.add(button);
        //add text field in the frame
        f.add(textfield);
        //visible of frame
        f.setVisible(true);
    }
}
