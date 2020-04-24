package ch09;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingEx02 extends JFrame {
	public SwingEx02() {
		setTitle("ContentPane�� JFrame");// ������ Ÿ��Ʋ �ޱ�
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ������ �����츦 ������ ���α׷��� �����ϵ��� ����

		Container contenPane = getContentPane(); // ����Ʈ ���� �˾Ƴ���.
		contenPane.setBackground(Color.ORANGE); // ����Ʈ���� ���� ������������
		contenPane.setLayout(new FlowLayout()); // ����Ʈ�ҿ� FlowLayout ��ġ ������ �ޱ�

		contenPane.add(new JButton("OK")); // OK��ư �ޱ�
		contenPane.add(new JButton("Cancel")); // Cancel ��ư �ޱ�
		contenPane.add(new JButton("Ignore")); // Ignore ��ư �ޱ�

		setSize(300, 150); // ������ ũ�� 300x150 ����
		setVisible(true); // ȭ�鿡 ������ ���
	}

	public static void main(String[] args) {
		new SwingEx02();

	}

}
