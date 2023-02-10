/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views.interfacesConsultaPaciente;


import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import views.InterfacePrincipal;
import static views.Views.consultaPacienteCpf;
import static views.autenticacao.Autenticador.disconect;
import views.interfacesConsultasAgendadas.*;
import views.interfaceConsultaDoutor.*;
import views.interfacesAgendamento.*;
import views.interfacesCadastro.*;
import views.interfacesConsultaPaciente.*;

/**
 *
 * @author cezarj59
 */
public class InterfaceConsultaPacientesCPF extends javax.swing.JFrame {

    /**
     * Creates new form InterfacePrincipal
     */
    public InterfaceConsultaPacientesCPF() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jScrollBar1 = new javax.swing.JScrollBar();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JSeparator();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jDialog1 = new javax.swing.JDialog();
        jDialog2 = new javax.swing.JDialog();
        jFrame1 = new javax.swing.JFrame();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jMenuItem2 = new javax.swing.JMenuItem();
        jButton3 = new javax.swing.JButton();
        jDesktopPane2 = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        buttonListarDados = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaConsultaPacientesPorCPF = new javax.swing.JTable();
        inputCPF = new javax.swing.JTextField();
        jMenuBar2 = new javax.swing.JMenuBar();
        inicio = new javax.swing.JMenu();
        menuInicio = new javax.swing.JMenuItem();
        menuCadastraPaciente = new javax.swing.JMenuItem();
        menuCadastraDoutor = new javax.swing.JMenuItem();
        menuAgendamentoConsulta = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        menuConsultaTodosPacientes = new javax.swing.JMenuItem();
        menuConsultaPacientePorNome = new javax.swing.JMenuItem();
        menuConsultaPacientePorCPF = new javax.swing.JMenuItem();
        menuConsultaAniversariantes = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        menuConsultaTodosDoutores = new javax.swing.JMenuItem();
        menuConsultaDoutoresPorNome = new javax.swing.JMenuItem();
        menuConsultaDoutoresPorEspecialidade = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        menuTodasConsultasAgendadas = new javax.swing.JMenuItem();
        menuConsultaAtivas = new javax.swing.JMenuItem();
        menuConsultasAgendadasParaHoje = new javax.swing.JMenuItem();
        menuConsultasAgendadasPorPaciente = new javax.swing.JMenuItem();
        menuConsultaAgendadaPorDoutor = new javax.swing.JMenuItem();
        menuConsultaAgendadaPorEspecialidade = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        logof = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        jMenuItem1.setText("jMenuItem1");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 153, 153));
        setPreferredSize(new java.awt.Dimension(1072, 656));

        jButton3.setText("jButton3");

        jDesktopPane2.setBackground(new java.awt.Color(255, 255, 255));
        jDesktopPane2.setOpaque(false);

        jLabel1.setBackground(new java.awt.Color(51, 153, 255));
        jLabel1.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CONSULTA DE PACIENTES");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Liberation Sans", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("CPF:");

        jLabel5.setBackground(new java.awt.Color(51, 51, 51));
        jLabel5.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Step 2023");
        jLabel5.setOpaque(true);

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("(Informe o CPF do Paciente para Consulta)");

        buttonListarDados.setBackground(new java.awt.Color(0, 153, 102));
        buttonListarDados.setForeground(new java.awt.Color(0, 0, 0));
        buttonListarDados.setText("Consultar");
        buttonListarDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonListarDadosActionPerformed(evt);
            }
        });

        jTabbedPane1.setBackground(new java.awt.Color(204, 204, 204));
        jTabbedPane1.setForeground(new java.awt.Color(51, 153, 255));

        tabelaConsultaPacientesPorCPF.setBackground(new java.awt.Color(255, 255, 255));
        tabelaConsultaPacientesPorCPF.setFont(new java.awt.Font("Serif", 0, 15)); // NOI18N
        tabelaConsultaPacientesPorCPF.setForeground(new java.awt.Color(0, 0, 0));
        tabelaConsultaPacientesPorCPF.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Data de Nascimento", "CPF", "Telefone", "Email"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaConsultaPacientesPorCPF.setGridColor(new java.awt.Color(0, 0, 0));
        tabelaConsultaPacientesPorCPF.setSelectionBackground(new java.awt.Color(51, 153, 255));
        tabelaConsultaPacientesPorCPF.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jScrollPane2.setViewportView(tabelaConsultaPacientesPorCPF);
        if (tabelaConsultaPacientesPorCPF.getColumnModel().getColumnCount() > 0) {
            tabelaConsultaPacientesPorCPF.getColumnModel().getColumn(0).setMinWidth(70);
            tabelaConsultaPacientesPorCPF.getColumnModel().getColumn(0).setPreferredWidth(40);
            tabelaConsultaPacientesPorCPF.getColumnModel().getColumn(0).setMaxWidth(70);
            tabelaConsultaPacientesPorCPF.getColumnModel().getColumn(1).setMinWidth(220);
            tabelaConsultaPacientesPorCPF.getColumnModel().getColumn(1).setMaxWidth(220);
            tabelaConsultaPacientesPorCPF.getColumnModel().getColumn(2).setMinWidth(150);
            tabelaConsultaPacientesPorCPF.getColumnModel().getColumn(2).setMaxWidth(150);
            tabelaConsultaPacientesPorCPF.getColumnModel().getColumn(3).setMinWidth(150);
            tabelaConsultaPacientesPorCPF.getColumnModel().getColumn(3).setMaxWidth(150);
            tabelaConsultaPacientesPorCPF.getColumnModel().getColumn(4).setMinWidth(150);
            tabelaConsultaPacientesPorCPF.getColumnModel().getColumn(4).setMaxWidth(150);
        }

        jTabbedPane1.addTab("PACIENTES", jScrollPane2);

        inputCPF.setBackground(new java.awt.Color(255, 255, 255));
        inputCPF.setColumns(14);
        inputCPF.setForeground(new java.awt.Color(0, 0, 0));

        jDesktopPane2.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(buttonListarDados, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jTabbedPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(inputCPF, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane2Layout = new javax.swing.GroupLayout(jDesktopPane2);
        jDesktopPane2.setLayout(jDesktopPane2Layout);
        jDesktopPane2Layout.setHorizontalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(inputCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(571, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonListarDados)
                .addGap(57, 57, 57))
            .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jDesktopPane2Layout.createSequentialGroup()
                    .addGap(55, 55, 55)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 960, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(90, Short.MAX_VALUE)))
        );
        jDesktopPane2Layout.setVerticalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(inputCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 371, Short.MAX_VALUE)
                .addComponent(buttonListarDados, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79)
                .addComponent(jLabel5))
            .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jDesktopPane2Layout.createSequentialGroup()
                    .addGap(185, 185, 185)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(183, Short.MAX_VALUE)))
        );

        jMenuBar2.setBackground(new java.awt.Color(255, 255, 255));
        jMenuBar2.setForeground(new java.awt.Color(51, 153, 255));
        jMenuBar2.setOpaque(true);

        inicio.setText("MENU");
        inicio.setFont(new java.awt.Font("Ubuntu", 1, 16)); // NOI18N
        inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inicioActionPerformed(evt);
            }
        });

        menuInicio.setText("Inicio");
        menuInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuInicioActionPerformed(evt);
            }
        });
        inicio.add(menuInicio);

        menuCadastraPaciente.setText("Cadadastro de Paciente");
        menuCadastraPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadastraPacienteActionPerformed(evt);
            }
        });
        inicio.add(menuCadastraPaciente);

        menuCadastraDoutor.setText("Cadadastro de Doutor");
        menuCadastraDoutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadastraDoutorActionPerformed(evt);
            }
        });
        inicio.add(menuCadastraDoutor);

        menuAgendamentoConsulta.setText("Agendamento de Consulta");
        menuAgendamentoConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAgendamentoConsultaActionPerformed(evt);
            }
        });
        inicio.add(menuAgendamentoConsulta);
        inicio.add(jSeparator2);

        menuConsultaTodosPacientes.setText("Consulta Todos Pacientes");
        menuConsultaTodosPacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuConsultaTodosPacientesActionPerformed(evt);
            }
        });
        inicio.add(menuConsultaTodosPacientes);

        menuConsultaPacientePorNome.setText("Pacientes por Nome");
        menuConsultaPacientePorNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuConsultaPacientePorNomeActionPerformed(evt);
            }
        });
        inicio.add(menuConsultaPacientePorNome);

        menuConsultaPacientePorCPF.setText("Pacientes por CPF");
        menuConsultaPacientePorCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuConsultaPacientePorCPFActionPerformed(evt);
            }
        });
        inicio.add(menuConsultaPacientePorCPF);

        menuConsultaAniversariantes.setText("Aniversariantes do Mês");
        menuConsultaAniversariantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuConsultaAniversariantesActionPerformed(evt);
            }
        });
        inicio.add(menuConsultaAniversariantes);
        inicio.add(jSeparator3);

        menuConsultaTodosDoutores.setText("Consulta Todos Doutores");
        menuConsultaTodosDoutores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuConsultaTodosDoutoresActionPerformed(evt);
            }
        });
        inicio.add(menuConsultaTodosDoutores);

        menuConsultaDoutoresPorNome.setText("Doutores por Nome");
        menuConsultaDoutoresPorNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuConsultaDoutoresPorNomeActionPerformed(evt);
            }
        });
        inicio.add(menuConsultaDoutoresPorNome);

        menuConsultaDoutoresPorEspecialidade.setText("Doutores por Especialidade");
        menuConsultaDoutoresPorEspecialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuConsultaDoutoresPorEspecialidadeActionPerformed(evt);
            }
        });
        inicio.add(menuConsultaDoutoresPorEspecialidade);
        inicio.add(jSeparator4);

        menuTodasConsultasAgendadas.setText("Todas Consultas Agendadas");
        menuTodasConsultasAgendadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuTodasConsultasAgendadasActionPerformed(evt);
            }
        });
        inicio.add(menuTodasConsultasAgendadas);

        menuConsultaAtivas.setText("Consultas Ativas");
        menuConsultaAtivas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuConsultaAtivasActionPerformed(evt);
            }
        });
        inicio.add(menuConsultaAtivas);

        menuConsultasAgendadasParaHoje.setText("Consultas Agendadas para Hoje");
        menuConsultasAgendadasParaHoje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuConsultasAgendadasParaHojeActionPerformed(evt);
            }
        });
        inicio.add(menuConsultasAgendadasParaHoje);

        menuConsultasAgendadasPorPaciente.setText("Por Paciente");
        menuConsultasAgendadasPorPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuConsultasAgendadasPorPacienteActionPerformed(evt);
            }
        });
        inicio.add(menuConsultasAgendadasPorPaciente);

        menuConsultaAgendadaPorDoutor.setText("Por Doutor");
        menuConsultaAgendadaPorDoutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuConsultaAgendadaPorDoutorActionPerformed(evt);
            }
        });
        inicio.add(menuConsultaAgendadaPorDoutor);

        menuConsultaAgendadaPorEspecialidade.setText("Por Especialidade");
        menuConsultaAgendadaPorEspecialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuConsultaAgendadaPorEspecialidadeActionPerformed(evt);
            }
        });
        inicio.add(menuConsultaAgendadaPorEspecialidade);
        inicio.add(jSeparator5);

        logof.setText("logof");
        logof.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logofActionPerformed(evt);
            }
        });
        inicio.add(logof);

        jMenuBar2.add(inicio);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane2)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane2)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonListarDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonListarDadosActionPerformed
        // TODO add your handling code here:
        if (inputCPF.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Digite o CPF a ser Consultado!");
        } else {
            consultaPacienteCpf(inputCPF.getText(), tabelaConsultaPacientesPorCPF);
            inputCPF.setText("");
        }

        
    }//GEN-LAST:event_buttonListarDadosActionPerformed

    private void menuInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuInicioActionPerformed
        // TODO add your handling code here:
        InterfacePrincipal i = new InterfacePrincipal();
        this.dispose();
        i.setVisible(true);
    }//GEN-LAST:event_menuInicioActionPerformed

    private void menuCadastraPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadastraPacienteActionPerformed
        // TODO add your handling code here:
        InterfaceCadastroPaciente i = new InterfaceCadastroPaciente();
        this.dispose();
        i.setVisible(true);
    }//GEN-LAST:event_menuCadastraPacienteActionPerformed

    private void menuCadastraDoutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadastraDoutorActionPerformed
        // TODO add your handling code here:
        InterfaceCadastroDoutor i = new InterfaceCadastroDoutor();
        this.dispose();
        i.setVisible(true);
    }//GEN-LAST:event_menuCadastraDoutorActionPerformed

    private void menuAgendamentoConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAgendamentoConsultaActionPerformed
        // TODO add your handling code here:
        InterfaceAgendamento i = new InterfaceAgendamento();
        this.dispose();
        i.setVisible(true);
    }//GEN-LAST:event_menuAgendamentoConsultaActionPerformed

    private void menuConsultaTodosPacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuConsultaTodosPacientesActionPerformed
        // TODO add your handling code here:
        InterfaceConsultaPacientesTodos i = new InterfaceConsultaPacientesTodos();
        this.dispose();
        i.setVisible(true);
    }//GEN-LAST:event_menuConsultaTodosPacientesActionPerformed

    private void menuConsultaPacientePorNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuConsultaPacientePorNomeActionPerformed
        // TODO add your handling code here:
        InterfaceConsultaPacientesNome i = new InterfaceConsultaPacientesNome();
        this.dispose();
        i.setVisible(true);
    }//GEN-LAST:event_menuConsultaPacientePorNomeActionPerformed

    private void menuConsultaPacientePorCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuConsultaPacientePorCPFActionPerformed
        // TODO add your handling code here:
        InterfaceConsultaPacientesCPF i = new InterfaceConsultaPacientesCPF();
        this.dispose();
        i.setVisible(true);
    }//GEN-LAST:event_menuConsultaPacientePorCPFActionPerformed

    private void menuConsultaAniversariantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuConsultaAniversariantesActionPerformed
        // TODO add your handling code here:
        InterfaceConsultaPacientesAniversariantes i = new InterfaceConsultaPacientesAniversariantes();
        this.dispose();
        i.setVisible(true);
    }//GEN-LAST:event_menuConsultaAniversariantesActionPerformed

    private void menuConsultaTodosDoutoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuConsultaTodosDoutoresActionPerformed
        // TODO add your handling code here:
        InterfaceConsultaDoutorTodos i = new InterfaceConsultaDoutorTodos();
        this.dispose();
        i.setVisible(true);
    }//GEN-LAST:event_menuConsultaTodosDoutoresActionPerformed

    private void menuConsultaDoutoresPorNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuConsultaDoutoresPorNomeActionPerformed
        // TODO add your handling code here:
        InterfaceConsultaDoutorNome i = new InterfaceConsultaDoutorNome();
        this.dispose();
        i.setVisible(true);
    }//GEN-LAST:event_menuConsultaDoutoresPorNomeActionPerformed

    private void menuConsultaDoutoresPorEspecialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuConsultaDoutoresPorEspecialidadeActionPerformed
        // TODO add your handling code here:
        InterfaceConsultaDoutorEspecialidade i = new InterfaceConsultaDoutorEspecialidade();
        this.dispose();
        i.setVisible(true);
    }//GEN-LAST:event_menuConsultaDoutoresPorEspecialidadeActionPerformed

    private void menuTodasConsultasAgendadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuTodasConsultasAgendadasActionPerformed
        // TODO add your handling code here:
        InterfaceConsultaAgendadaTodas i = new InterfaceConsultaAgendadaTodas();
        this.dispose();
        i.setVisible(true);
    }//GEN-LAST:event_menuTodasConsultasAgendadasActionPerformed

    private void menuConsultaAtivasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuConsultaAtivasActionPerformed
        // TODO add your handling code here:
        InterfaceConsultaAgendadaAtivas i = new InterfaceConsultaAgendadaAtivas();
        this.dispose();
        i.setVisible(true);
    }//GEN-LAST:event_menuConsultaAtivasActionPerformed

    private void menuConsultasAgendadasParaHojeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuConsultasAgendadasParaHojeActionPerformed
        // TODO add your handling code here:
        InterfaceConsultaAgendadaHoje i = new InterfaceConsultaAgendadaHoje();
        this.dispose();
        i.setVisible(true);
    }//GEN-LAST:event_menuConsultasAgendadasParaHojeActionPerformed

    private void menuConsultasAgendadasPorPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuConsultasAgendadasPorPacienteActionPerformed
        // TODO add your handling code here:
        InterfaceConsultaAgendadaPorPaciente i = new InterfaceConsultaAgendadaPorPaciente();
        this.dispose();
        i.setVisible(true);
    }//GEN-LAST:event_menuConsultasAgendadasPorPacienteActionPerformed

    private void menuConsultaAgendadaPorDoutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuConsultaAgendadaPorDoutorActionPerformed
        // TODO add your handling code here:
        InterfaceConsultaAgendadaPorDoutor i = new InterfaceConsultaAgendadaPorDoutor();
        this.dispose();
        i.setVisible(true);
    }//GEN-LAST:event_menuConsultaAgendadaPorDoutorActionPerformed

    private void menuConsultaAgendadaPorEspecialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuConsultaAgendadaPorEspecialidadeActionPerformed
        // TODO add your handling code here:
        InterfaceConsultaAgendadaPorEspecialidade i = new InterfaceConsultaAgendadaPorEspecialidade();
        this.dispose();
        i.setVisible(true);
    }//GEN-LAST:event_menuConsultaAgendadaPorEspecialidadeActionPerformed

    private void inicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inicioActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_inicioActionPerformed

    private void logofActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logofActionPerformed
        // TODO add your handling code here:
        this.dispose();
        disconect();

    }//GEN-LAST:event_logofActionPerformed
   

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        UIManager.put("nimbusBase", new Color(51, 153, 255));
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InterfaceConsultaPacientesCPF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaceConsultaPacientesCPF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaceConsultaPacientesCPF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceConsultaPacientesCPF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfaceConsultaPacientesCPF().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton buttonListarDados;
    private javax.swing.JMenu inicio;
    private javax.swing.JTextField inputCPF;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JMenuItem logof;
    private javax.swing.JMenuItem menuAgendamentoConsulta;
    private javax.swing.JMenuItem menuCadastraDoutor;
    private javax.swing.JMenuItem menuCadastraPaciente;
    private javax.swing.JMenuItem menuConsultaAgendadaPorDoutor;
    private javax.swing.JMenuItem menuConsultaAgendadaPorEspecialidade;
    private javax.swing.JMenuItem menuConsultaAniversariantes;
    private javax.swing.JMenuItem menuConsultaAtivas;
    private javax.swing.JMenuItem menuConsultaDoutoresPorEspecialidade;
    private javax.swing.JMenuItem menuConsultaDoutoresPorNome;
    private javax.swing.JMenuItem menuConsultaPacientePorCPF;
    private javax.swing.JMenuItem menuConsultaPacientePorNome;
    private javax.swing.JMenuItem menuConsultaTodosDoutores;
    private javax.swing.JMenuItem menuConsultaTodosPacientes;
    private javax.swing.JMenuItem menuConsultasAgendadasParaHoje;
    private javax.swing.JMenuItem menuConsultasAgendadasPorPaciente;
    private javax.swing.JMenuItem menuInicio;
    private javax.swing.JMenuItem menuTodasConsultasAgendadas;
    private javax.swing.JTable tabelaConsultaPacientesPorCPF;
    // End of variables declaration//GEN-END:variables
}
