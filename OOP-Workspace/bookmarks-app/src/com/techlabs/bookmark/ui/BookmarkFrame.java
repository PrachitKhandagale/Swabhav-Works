package com.techlabs.bookmark.ui;

import java.awt.Container;
import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.URI;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.text.Utilities;

import com.techlabs.business.Bookmark;
import com.techlabs.service.BookmarkManager;

public class BookmarkFrame extends JFrame {
	// private static String filePath = "Data\\Bookmark.csv";
	private static final long serialVersionUID = 1L;
	private Container container;
	private JLabel label1;
	private JLabel label2;
	private JButton addButton;
	private JButton displayButton;
	private JTextField urlLabel;
	private JTextField urlLink;
	private JTextPane textArea;
	private Map<String,URI> linkMap = new HashMap<String,URI>();
	
	public BookmarkFrame() {
		setTitle("Bookmark Frame");

		container = getContentPane();
		label1 = new JLabel("Name:");
		label2 = new JLabel("URL:");
		urlLabel = new JTextField();
		addButton = new JButton("ADD");
		displayButton = new JButton("Display");
		urlLink = new JTextField();
		textArea = new JTextPane();
		textArea.setContentType("text/html");
		

		label1.setBounds(100, 100, 200, 30);
		urlLabel.setBounds(170, 100, 150, 30);
		label2.setBounds(100, 150, 200, 40);
		urlLink.setBounds(170, 150, 150, 30);
		addButton.setBounds(200, 200, 100, 30);
		displayButton.setBounds(200, 250, 100, 30);
		textArea.setBounds(100, 350, 600, 600);
		textArea.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				/*
				URI uri;

				for (int i = 0; i <= view.getListOfStrings().size(); i++) {
					if (e.getSource().toString().contains(view.getStringsOfJlabel().get(i))) {
						try {

							String[] urlName = view.getListOfStringsOfJlabel().get(i).getText().split(">");
							String name = view.getListOfStrings().get(i);
							String temp[] = name.split(">");
							System.out.println(Arrays.toString(temp) + " " + temp[0].substring(8));
							System.out.println("url of website: " + temp[0].substring(8));
							uri = new URI(temp[0].substring(8));
							open(uri);
							return;
						} catch (URISyntaxException e1) {
							e1.printStackTrace();
						}
					}
				}*/
				try {
				String wrd=null;
	            int pt=textArea.viewToModel(e.getPoint());
	            int spt=Utilities.getWordStart(textArea,pt);
	            int ept=Utilities.getWordEnd(textArea,pt);
	            textArea.setSelectionStart(spt);
	            textArea.setSelectionEnd(ept);
	            wrd=textArea.getSelectedText();
	            URI linkUri = linkMap.get(wrd);
	            Desktop.getDesktop().browse(linkUri);
				
				//System.out.println(e.getSource().toString().contains("Prachit"));
				}catch(Exception exp) {
					exp.printStackTrace();
				}
				
				
			}
		});

		container.add(label1);
		container.add(label2);
		container.add(urlLabel);
		container.add(urlLink);
		container.add(addButton);
		container.add(displayButton);
		container.add(textArea);
		setSize(500, 500);
		setLayout(null);
		setVisible(true);
		addButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				Bookmark bookmark = new Bookmark(urlLabel.getText(), urlLink.getText());
				BookmarkManager.addSingleEntryToFile(bookmark);
				urlLabel.setText("");
				urlLink.setText("");
			}
		});

		displayButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {


				List<String> string=BookmarkManager.readFile();
				textArea.setText("");
				String txt="";
				linkMap.clear();
				for(String str:string) {
					//textArea.setText(textArea.getText() + str + "\n");
					//textArea.append(str + "\n");
					String[] stringArray=str.split(",");
					txt = txt + "<a href='"+stringArray[1]+"'>"+stringArray[0]+"</a><br>";
					try {
					linkMap.put(stringArray[0],new URI(stringArray[1]));
					}catch(Exception exp) {
						exp.printStackTrace();
					}
				}
				textArea.setText(txt);
			}
		});
	}
}
