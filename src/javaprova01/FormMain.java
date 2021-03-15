
package javaprova01;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FormMain extends javax.swing.JFrame {
    private VideoRental videoRental;
    private Opinions opinions;
    
    public FormMain()
    {
        initComponents();    
        
        try 
        {
            getAllMovies();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FormMain.class.getName()).log(Level.SEVERE, null, ex);
        }     
        
        fillComboBoxMovies();
        TextAreaSynopsis.setEditable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        ComboBoxMovies = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListMovie = new javax.swing.JList<>();
        ButtonSelect = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TextAreaSynopsis = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        ImagePanel = new javax.swing.JPanel();
        ImageLable = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Lista de filmed");

        jScrollPane1.setViewportView(ListMovie);

        ButtonSelect.setText("Selecionar");
        ButtonSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSelectActionPerformed(evt);
            }
        });

        TextAreaSynopsis.setColumns(20);
        TextAreaSynopsis.setLineWrap(true);
        TextAreaSynopsis.setRows(5);
        TextAreaSynopsis.setWrapStyleWord(true);
        jScrollPane2.setViewportView(TextAreaSynopsis);

        jLabel2.setText("Sinopse");

        javax.swing.GroupLayout ImagePanelLayout = new javax.swing.GroupLayout(ImagePanel);
        ImagePanel.setLayout(ImagePanelLayout);
        ImagePanelLayout.setHorizontalGroup(
            ImagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ImagePanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(ImageLable, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        ImagePanelLayout.setVerticalGroup(
            ImagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ImageLable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ComboBoxMovies, javax.swing.GroupLayout.PREFERRED_SIZE, 664, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ButtonSelect))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGap(41, 41, 41)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(232, 232, 232)
                                .addComponent(jLabel2)))
                        .addGap(73, 73, 73)
                        .addComponent(ImagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(ComboBoxMovies, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonSelect))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addGap(9, 9, 9)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(ImagePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void getAllMovies() throws FileNotFoundException
    {
        List<Movie> listMovies = new ArrayList<>();
        List<Assessment> listAssessments = new ArrayList<>();
        String[] content = null;
        
        Scanner scanner = new Scanner(new File("..\\VideoRental\\Data\\Lista_de_filmes.csv")); 
        scanner.useDelimiter("\n");   
        
        while(scanner.hasNext())
        {
            content = scanner.next().trim().split(";");
            
            listMovies.add(new Movie(Integer.parseInt(content[0]), content[1], content[2], content[3]));                   
        }
        
        scanner = new Scanner(new File("..\\VideoRental\\Data\\Avaliações.csv"));       
        scanner.useDelimiter("\n");
        
        while(scanner.hasNext())
        {
            content = scanner.next().trim().split(";");
            
            listAssessments.add(new Assessment(Integer.parseInt(content[0]), content[1], Integer.parseInt(content[2]), content[3]));         
        }
        scanner.close();
        
        videoRental = new VideoRental(listMovies.toArray(new Movie[listMovies.size()]));       
        opinions = new Opinions(listAssessments.toArray(new Assessment[listAssessments.size()]));
    }
    private void fillComboBoxMovies() 
    {
        for(String movieName : videoRental.getAllMovieNames())
        {
            ComboBoxMovies.addItem(movieName);
        }       
    }
    private String getPathFilmCover(String selectedNameParameter)
    {
        File file = new File("..\\VideoRental\\Movie covers\\");
        File[] fileArray = file.listFiles();
        String selectedName = selectedNameParameter;
        String nameHelper = "";
        
        for (File arquivo : fileArray) 
        {
            nameHelper = arquivo.toString();
            if(nameHelper.indexOf(selectedName) > -1)
            {        
                selectedName = nameHelper;
                break;
            }
        }       
        return selectedName;
    }
    private void ButtonSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSelectActionPerformed
        Movie movie = null;
        Assessment highAssessment = null;
        Assessment lowAssessment = null;
        String selectedName = null; 
        int movieIndex = -1;
        DefaultListModel model = new DefaultListModel();
        
        selectedName = ComboBoxMovies.getSelectedItem().toString();
        
        movieIndex = videoRental.searchMovie(selectedName);
                
        movie = videoRental.getMovies()[movieIndex];
        ListMovie.setModel(model);
        model.addElement("Nome do filme: " + movie.getName());
        model.addElement("Genero: " + movie.getGenre());     
        model.addElement("Média de avaliações: " + String.format("%.2f", opinions.totalAverageMovieRating(movie.getMovieID())));
        
        highAssessment = opinions.highestRatedMovie(movie.getMovieID());
        model.addElement("Nome do Avaliador: " + highAssessment.getEvaluator());
        model.addElement("Comentário do Avaliador: " + highAssessment.getComment());
        model.addElement("Nota mais alta: " + highAssessment.getNote());
        
        lowAssessment = opinions.worstRatedMovie(movie.getMovieID());
        model.addElement("Nome do Avaliador: " + lowAssessment.getEvaluator());
        model.addElement("Comentário do Avaliador: " + lowAssessment.getComment());
        model.addElement("Nota mais baixa: " + lowAssessment.getNote());
        
        TextAreaSynopsis.setText(movie.getSynopsis());   
        
        ImageLable.setIcon(new ImageIcon(getPathFilmCover(selectedName)));
    }//GEN-LAST:event_ButtonSelectActionPerformed

    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonSelect;
    private javax.swing.JComboBox<String> ComboBoxMovies;
    private javax.swing.JLabel ImageLable;
    private javax.swing.JPanel ImagePanel;
    private javax.swing.JList<String> ListMovie;
    private javax.swing.JTextArea TextAreaSynopsis;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
