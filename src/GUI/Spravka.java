
package GUI;

import static java.awt.Toolkit.getDefaultToolkit;

/**
 *
 * @author Skel&Targarian
 */
public class Spravka extends BaseChildFrame {

    public static String spravkaForViktorina = "Здравствуй! Здесь я написал для тебя  информацию по викторине, " 
           +"если что–то стало не понятно. Суть викторины такова – ты отвечаешь на вопросы, которая даёт тебе программа (по факту это я конечно "
           +"писал, но сейчас то тебе выдает программа? ). Вопросы появляются при нажатии тобой специальной кнопки, на которой написано: ”Получить вопрос”. " 
           +"Далее ниже, в специально отведенном для этого месте, ты пишешь ответ, и затем нажимаешь на кнопку:”Проверить ответ”. В зависимости от того, правильный ты дал ответ "
           +"или не правильный, ты будешь получать баллы, в результате увидишь, насколько ты был хорош! Также будет звучать специальная музыка. " 
           +"Эту музыку можно отключить нажатием кнопки с соответствующим указателем. Чтобы включить, нажми на эту кнопку ещё разок.";
    
    public static String spravkaAboutProramFromMainMenu = "Данная программа была создана двумя молодыми людьми,для того, чтобы их близкие и родные, которые запустят эту программу,"
            + " получили заряд приятного настроения и позитивных эмоций! Мы сделали это для Вас, наши дорогие и любимые! И надеемся, что вам понравится это наше \"Детище\":) "
            + "Также мы продолжаем работу в улучшении нашего проекта, и мы постараемся, чтобы в скором будущем, стали появляться более новые версии.\n" +
"Также хотелось бы услышать от Вас, что именно по вашему мнению, нам нужно добавить, убрать, или улучшить.\n" +
"\n" +
"\n" +
"			  Всего доброго!";
    
    public static String spravkaAboutMainMenu = "Здесь я постараюсь как можно короче и доступнее объяснить главное меню. Тут я расположил несколько пунктов, которые переведут тебя на"
            + " соответствующие вкладки.";
    
    public static String spravkaForTraining = "Привет. Я объясню тебе концепцию игры, и вообще для чего она нужна. В результате выбранного тобой уровня сложности, "
            + "в предыдущем меню, будет зависеть скорость игры и концовка. Если ты не можешь пройти уровень, попробуй поменять сложность! Эта игра развивает скорость написания текста, "
            + "реакцию, а также жизненное чутье:)\n "
            + "Теперь я объясню тебе принципы тренировки:"
            + "Написанная зелёным цветом фраза, которая появляется выше изображений компьютеров - это то, что ты должен сказать(написать) быстрее, чем твой соперник, с лейкопластырем на носу!!! "
            + "Ведь и в реальной жизни, никто ждать твоего ответа не собирается, здесь также, никто не будет ждать, пока ты соберёшься с силами. Так вот, "
            + "для старта, нажми пробел, появляется фраза, ты её пишешь, по окончанию нажимай клавишу Enter(энтер), и там уже видно будет, успел ли ты во время и без ошибок, или нет. В середине изображен индикатор времени, "
            + " в зависимости от того, сколько осталось, он будет менять цвет, но я думаю, ты итак это всё понимаешь. "
            + "В тренировке у тебя есть бесконечное число попыток, в самой же игре у тебя их будет 10 на каждую ситуацию! Пиши внимательно, тебе нужно соблюдать всю пунктуацию, иначе ответ не пройдет."
            + "Желаем тебе удачи! ";
    
    public Spravka() {
        initComponents();
        this.setIconImage(getDefaultToolkit().getImage(getClass().getResource("444.png")));
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        text = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        text.setEditable(false);
        text.setColumns(20);
        text.setFont(new java.awt.Font("Corbel", 1, 12)); // NOI18N
        text.setLineWrap(true);
        text.setRows(5);
        text.setWrapStyleWord(true);
        jScrollPane1.setViewportView(text);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 350, 400));

        jLabel1.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        jLabel1.setText("Вся, нужная тебе информация, находится здесь!");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 330, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Materials/JPG/spravka.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 480));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Spravka.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Spravka.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Spravka.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Spravka.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Spravka().setVisible(true);
//            }
//        });
//    }

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Spravka.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Spravka.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Spravka.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Spravka.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Spravka().setVisible(true);
//            }
//        });
//    }
    
    @Override
    protected void setCloseOperation() {
     
    super.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTextArea text;
    // End of variables declaration//GEN-END:variables
}
