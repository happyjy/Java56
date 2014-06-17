package exam.oop3.step03;

/* 성적 등록 폼 만들기
 * - Panel 사용 
 *   > 여러 개의 UI 컴포넌트를 묶을 때 사용하는 윈도우 
 */

import java.awt.Button;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ScoreFrame  extends Frame {
	TextField tfName = new TextField(20);
	TextField tfKor = new TextField(5);
	TextField tfEng = new TextField(5);
	TextField tfMath = new TextField(5);
	
	public ScoreFrame() {
		this.setTitle("비트 성적관리 시스템");
		this.setSize(400, 300);
		
		this.addWindowListener(new WindowAdapter() {
		  public void windowClosing(WindowEvent e) {
			  System.exit(0);
		  }
		});
		
		this.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		this.add( createRowPanel("이름", tfName) );
		this.add( createRowPanel("국어", tfKor) );
		this.add( createRowPanel("영어", tfEng) );
		this.add( createRowPanel("수학", tfMath) );
		
		Button btn = new Button("추가");
		btn.setPreferredSize(new Dimension(80, 40));
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("이름:" + tfName.getText());
				System.out.println("국어:" + tfKor.getText());
				System.out.println("영어:" + tfEng.getText());
				System.out.println("수학:" + tfMath.getText());
				
				
			}
		});
		
		this.add(btn);
		
		
	}
	
	private Panel createRowPanel(String title, Component comp) {
		Panel panel = new Panel(new FlowLayout(FlowLayout.LEFT)); 
		panel.setPreferredSize(new Dimension(300, 25));
		
		Label label = new Label(title);
		label.setPreferredSize(new Dimension(50, 25));
		panel.add(label);
		
		panel.add(comp);
		
		return panel;
	}

}



















