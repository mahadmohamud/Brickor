import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.util.*;

public class brickor extends JFrame{
    private JPanel myPanel;
    private JButton jButton1;
    private JButton jButton2;
    private JButton jButton3;
    private JButton jButton4;
    private JButton jButton5;
    private JButton jButton6;
    private JButton jButton7;
    private JButton jButton8;
    private JButton jButton9;
    private JButton jButton10;
    private JButton jButton11;
    private JButton jButton12;
    private JButton jButton13;
    private JButton jButton14;
    private JButton jButton15;
    private JButton jButton16;
    private JButton jbtnExit;
    private JButton jbtnReset;

    public brickor(String title)
    {
        super(title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //
        this.setContentPane(myPanel); // formen vi skapade brickor.form
        this.pack(); //lägga en jframe
        jButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                emptySpotChecker(jButton1, jButton2); // när vi klickar 1 den kommer kollar butt 1 och butt2
                emptySpotChecker(jButton1, jButton5);
                solutionChecker();
            }
        }); // 34-
        jButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                emptySpotChecker(jButton2, jButton1);
                emptySpotChecker(jButton2, jButton3);
                emptySpotChecker(jButton2, jButton6);
                solutionChecker();
            }
        });
        jButton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                emptySpotChecker(jButton3, jButton2);
                emptySpotChecker(jButton3, jButton4);
                emptySpotChecker(jButton3, jButton7);
                solutionChecker();
            }
        });
        jButton4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                emptySpotChecker(jButton4, jButton3);
                emptySpotChecker(jButton4, jButton8);
                solutionChecker();
            }
        });
        jButton5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                emptySpotChecker(jButton5, jButton1);
                emptySpotChecker(jButton5, jButton6);
                emptySpotChecker(jButton5, jButton9);
                solutionChecker();
            }
        });
        jButton6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                emptySpotChecker(jButton6, jButton2);
                emptySpotChecker(jButton6, jButton5);
                emptySpotChecker(jButton6, jButton7);
                emptySpotChecker(jButton6, jButton10);
                solutionChecker();
            }
        });
        jButton7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                emptySpotChecker(jButton7, jButton3);
                emptySpotChecker(jButton7, jButton6);
                emptySpotChecker(jButton7, jButton8);
                emptySpotChecker(jButton7, jButton11);
                solutionChecker();
            }
        });
        jButton8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                emptySpotChecker(jButton8, jButton4);
                emptySpotChecker(jButton8, jButton7);
                emptySpotChecker(jButton8, jButton12);
                solutionChecker();
            }
        });
        jButton9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                emptySpotChecker(jButton9, jButton5);
                emptySpotChecker(jButton9, jButton10);
                emptySpotChecker(jButton9, jButton13);
                solutionChecker();
            }
        });
        jButton10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                emptySpotChecker(jButton10, jButton6);
                emptySpotChecker(jButton10, jButton9);
                emptySpotChecker(jButton10, jButton11);
                emptySpotChecker(jButton10, jButton14);
                solutionChecker();
            }
        });
        jButton11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                emptySpotChecker(jButton11, jButton7);
                emptySpotChecker(jButton11, jButton10);
                emptySpotChecker(jButton11, jButton12);
                emptySpotChecker(jButton11, jButton15);
                solutionChecker();
            }
        });
        jButton12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                emptySpotChecker(jButton12, jButton8);
                emptySpotChecker(jButton12, jButton11);
                emptySpotChecker(jButton12, jButton16);
                solutionChecker();
            }
        });
        jButton13.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                emptySpotChecker(jButton13, jButton9);
                emptySpotChecker(jButton13, jButton14);
                solutionChecker();
            }
        });
        jButton14.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                emptySpotChecker(jButton14, jButton10);
                emptySpotChecker(jButton14, jButton13);
                emptySpotChecker(jButton14, jButton15);
                solutionChecker();
            }
        });
        jButton15.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                emptySpotChecker(jButton15, jButton11);
                emptySpotChecker(jButton15, jButton14);
                emptySpotChecker(jButton15, jButton16);
                solutionChecker();
            }
        });
        jButton16.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                emptySpotChecker(jButton16, jButton12);
                emptySpotChecker(jButton16, jButton15);
                solutionChecker();
            }
        });
        jbtnReset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                startGame();
            }
        });
        jbtnExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    myPanel.addComponentListener(new ComponentAdapter() { } );}
    // Följande funktion flyttar siffror till empty space om tomt utrymme är inom deras intervall.
    void emptySpotChecker(JButton butt1, JButton butt2) // två button variable
    {
        String shuffleNumber = butt2.getText();
        if(shuffleNumber == "")
        {
            butt2.setText(butt1.getText());
            butt1.setText("");
        }
    }
    // Kollar om det stämmmer. Budskapet kommer up
    public void solutionChecker()
    {
        String b1 = jButton1.getText();
        String b2 = jButton2.getText();
        String b3 = jButton3.getText();
        String b4 = jButton4.getText();
        String b5 = jButton5.getText();
        String b6 = jButton6.getText();
        String b7 = jButton7.getText();
        String b8 = jButton8.getText();
        String b9 = jButton9.getText();
        String b10 = jButton10.getText();
        String b11 = jButton11.getText();
        String b12 = jButton12.getText();
        String b13 = jButton13.getText();
        String b14 = jButton14.getText();
        String b15 = jButton15.getText();
        String b16 = jButton16.getText();
        if(b1=="1" && b2=="2" && b3=="3" && b4=="4" && b5=="5" && b6=="6" && b7=="7" && b8=="8" && b9=="9"
                && b10=="10" && b11=="11" && b12=="12" && b13=="13" && b14=="14" && b15=="15" && b16=="")
        {
            JOptionPane.showMessageDialog(this, "Congratulations, you won!");
        }
    }
    // funktion som skapar random nummer
    public void startGame()
    {
        int [] bnum = new int[16]; //skapade en array
        int i, j, rowChecker;
        Boolean flag = false;

        i = 1;

        do
        {
            Random rnum = new Random(); // skapa random lägga i variabeln rnum
            rowChecker = rnum.nextInt((15)+1); //15 knappar och +1 är empty totalt 16
//rowchecker lägga numret till array till string
            for(j=1; j<=i; j++)
            {
                if(bnum[j]==rowChecker)
                {
                    flag = true;
                }
            }
            if(flag==true)
            {
                flag = false;
            }
            else
            {
                bnum[i] = rowChecker; //lägger array i 229
                i++;
            }
        }
        while(i<=15); //vi behöver string för lägga numret
        jButton1.setText(Integer.toString(bnum[1])); //integer konvert to string och ska lägga i button
        jButton2.setText(Integer.toString(bnum[2]));
        jButton3.setText(Integer.toString(bnum[3]));
        jButton4.setText(Integer.toString(bnum[4]));
        jButton5.setText(Integer.toString(bnum[5]));
        jButton6.setText(Integer.toString(bnum[6]));
        jButton7.setText(Integer.toString(bnum[7]));
        jButton8.setText(Integer.toString(bnum[8]));
        jButton9.setText(Integer.toString(bnum[9]));
        jButton10.setText(Integer.toString(bnum[10]));
        jButton11.setText(Integer.toString(bnum[11]));
        jButton12.setText(Integer.toString(bnum[12]));
        jButton13.setText(Integer.toString(bnum[13]));
        jButton14.setText(Integer.toString(bnum[14]));
        jButton15.setText(Integer.toString(bnum[15]));
        jButton16.setText("");
    }

    public static void main(String []args)
    {
        JFrame frame = new brickor( "15 Brickor");
        frame.setVisible(true);
    }
}
