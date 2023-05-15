package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import Compressor_Decompressor.compressor;
import Compressor_Decompressor.decompressor;


public class JFrameCreate extends JFrame implements ActionListener {
	
	 JFrame frame;
	JButton Compress;
	JButton De_Compress;
	JFrameCreate()
	{
		frame=new JFrame("compressor-DeCompressor");
		frame.setVisible(true);
		frame.setLayout(null);
		frame.setBackground(Color.red);
		frame.setSize(1000, 500);
		frame.getContentPane().setBackground(Color.BLACK);
		
		Compress=new JButton("Compress");
	
		
		Compress.setBounds(250, 200, 200, 40);
		Compress.setBackground(Color.red);
		Compress.setForeground(Color.cyan);
		Compress.addActionListener(this);
		frame.add(Compress);
		
		De_Compress=new JButton("DeCompress");
		De_Compress.setBounds(500, 200, 200, 40);
		De_Compress.setBackground(Color.blue);
		De_Compress.setForeground(Color.cyan);
		De_Compress.addActionListener(this);
		frame.add(De_Compress);
		
		
	}

	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==Compress)
		{
			JFileChooser fileChooser = new JFileChooser();
			
			int response = fileChooser.showSaveDialog(null);
		    
			if(response==JFileChooser.APPROVE_OPTION)
			{
				File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
				System.out.print(file);
				try {
					compressor.method(file);
				}
				catch(Exception ee)
				{
					JOptionPane.showMessageDialog(null, ee.toString());
				}
			}
			
			
		}
		
		if(e.getSource()==De_Compress) {
			
             JFileChooser fileChooser = new JFileChooser();
			
			int response = fileChooser.showSaveDialog(null);
		    
			if(response==JFileChooser.APPROVE_OPTION)
			{
				File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
				System.out.print(file);
				try {
					decompressor.method(file);
				}
				catch(Exception ee)
				{
					JOptionPane.showMessageDialog(null, ee.toString());
				}
			}
			
			
		}
		
	}

}
