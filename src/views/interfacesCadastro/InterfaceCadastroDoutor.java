/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views.interfacesCadastro;

import controllers.DoutorController;
import java.awt.Color;
import javax.swing.UIManager;
import models.Doutor;
import services.Constante;
import views.InterfacePrincipal;
import views.interfacesConsultasAgendadas.*;
import views.interfaceConsultaDoutor.*;
import views.interfacesAgendamento.*;
import views.interfacesCadastro.*;
import views.interfacesConsultaPaciente.*;

/**
 *
 * @author cezarj59
 */
public class InterfaceCadastroDoutor extends javax.swing.JFrame {

    /**
     * Creates new form InterfacePrincipal
     */
    public InterfaceCadastroDoutor() {
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

        jButton3 = new javax.swing.JButton();
        jDesktopPane2 = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        buttonCadastrar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        inputEspecialidade = new javax.swing.JTextField();
        inputCro = new javax.swing.JTextField();
        inputNome = new javax.swing.JTextField();
        jMenuBar2 = new javax.swing.JMenuBar();
        inicio2 = new javax.swing.JMenu();
        menuInicio2 = new javax.swing.JMenuItem();
        menuCadastraPaciente = new javax.swing.JMenuItem();
        menuCadastraDoutor = new javax.swing.JMenuItem();
        menuAgendamentoConsulta = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        menuConsultaTodosPacientes = new javax.swing.JMenuItem();
        menuConsultaPacientePorNome = new javax.swing.JMenuItem();
        menuConsultaPacientePorCPF = new javax.swing.JMenuItem();
        menuConsultaAniversariantes = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        menuConsultaTodosDoutores = new javax.swing.JMenuItem();
        menuConsultaDoutoresPorNome = new javax.swing.JMenuItem();
        menuConsultaDoutoresPorEspecialidade = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        menuTodasConsultasAgendadas = new javax.swing.JMenuItem();
        menuConsultaAtivas = new javax.swing.JMenuItem();
        menuConsultasAgendadasParaHoje = new javax.swing.JMenuItem();
        menuConsultasAgendadasPorPaciente = new javax.swing.JMenuItem();
        menuConsultaAgendadaPorDoutor = new javax.swing.JMenuItem();
        menuConsultaAgendadaPorEspecialidade = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 153, 153));
        setLocationByPlatform(true);

        jButton3.setText("jButton3");

        jDesktopPane2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(51, 153, 255));
        jLabel1.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CADASTRO DE DOUTOR");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Liberation Sans", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Nome:");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Liberation Sans", 0, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("CRO:");

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Liberation Sans", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Especialidade:");

        jLabel5.setBackground(new java.awt.Color(51, 51, 51));
        jLabel5.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Step 2023");
        jLabel5.setOpaque(true);

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("(Ex: Protese Dentaria, Restauração)");

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("(Informe o CRO do Doutor)");

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("(Informe o nome do Doutor)");

        buttonCadastrar.setBackground(new java.awt.Color(0, 153, 102));
        buttonCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        buttonCadastrar.setText("Cadastrar");
        buttonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCadastrarActionPerformed(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Liberation Sans", 1, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Dados do Doutor");

        jButton2.setBackground(new java.awt.Color(153, 153, 153));
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("Voltar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        inputEspecialidade.setBackground(new java.awt.Color(255, 255, 255));
        inputEspecialidade.setColumns(60);
        inputEspecialidade.setForeground(new java.awt.Color(0, 0, 0));
        inputEspecialidade.setMinimumSize(new java.awt.Dimension(13, 22));
        inputEspecialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputEspecialidadeActionPerformed(evt);
            }
        });

        inputCro.setBackground(new java.awt.Color(255, 255, 255));
        inputCro.setColumns(20);
        inputCro.setForeground(new java.awt.Color(0, 0, 0));
        inputCro.setMinimumSize(new java.awt.Dimension(13, 22));
        inputCro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputCroActionPerformed(evt);
            }
        });

        inputNome.setBackground(new java.awt.Color(255, 255, 255));
        inputNome.setColumns(100);
        inputNome.setForeground(new java.awt.Color(0, 0, 0));
        inputNome.setMinimumSize(new java.awt.Dimension(13, 22));
        inputNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputNomeActionPerformed(evt);
            }
        });

        jDesktopPane2.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(buttonCadastrar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(inputEspecialidade, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(inputCro, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(inputNome, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane2Layout = new javax.swing.GroupLayout(jDesktopPane2);
        jDesktopPane2.setLayout(jDesktopPane2Layout);
        jDesktopPane2Layout.setHorizontalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane2Layout.createSequentialGroup()
                        .addGap(330, 330, 330)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jDesktopPane2Layout.createSequentialGroup()
                            .addGap(222, 222, 222)
                            .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(buttonCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jDesktopPane2Layout.createSequentialGroup()
                                    .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(inputCro, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jDesktopPane2Layout.createSequentialGroup()
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(2, 2, 2)
                                            .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel7)
                                                .addComponent(inputEspecialidade, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8)
                                            .addComponent(inputNome, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(17, 17, 17))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane2Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(391, 391, 391)))
                    .addGroup(jDesktopPane2Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDesktopPane2Layout.createSequentialGroup()
                        .addGap(390, 390, 390)
                        .addComponent(jLabel6)))
                .addContainerGap(294, Short.MAX_VALUE))
        );
        jDesktopPane2Layout.setVerticalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(inputNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(inputCro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGap(20, 20, 20)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(36, 36, 36)
                        .addComponent(buttonCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(165, 165, 165)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jLabel5))
                    .addGroup(jDesktopPane2Layout.createSequentialGroup()
                        .addComponent(inputEspecialidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6))))
        );

        jMenuBar2.setBackground(new java.awt.Color(255, 255, 255));
        jMenuBar2.setForeground(new java.awt.Color(51, 153, 255));
        jMenuBar2.setOpaque(true);

        inicio2.setText("MENU");
        inicio2.setFont(new java.awt.Font("Ubuntu", 1, 16)); // NOI18N
        inicio2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inicio2ActionPerformed(evt);
            }
        });

        menuInicio2.setText("Inicio");
        menuInicio2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuInicio2ActionPerformed(evt);
            }
        });
        inicio2.add(menuInicio2);

        menuCadastraPaciente.setText("Cadadastro de Paciente");
        menuCadastraPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadastraPacienteActionPerformed(evt);
            }
        });
        inicio2.add(menuCadastraPaciente);

        menuCadastraDoutor.setText("Cadadastro de Doutor");
        menuCadastraDoutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadastraDoutorActionPerformed(evt);
            }
        });
        inicio2.add(menuCadastraDoutor);

        menuAgendamentoConsulta.setText("Agendamento de Consulta");
        menuAgendamentoConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAgendamentoConsultaActionPerformed(evt);
            }
        });
        inicio2.add(menuAgendamentoConsulta);
        inicio2.add(jSeparator1);

        menuConsultaTodosPacientes.setText("Consulta Todos Pacientes");
        menuConsultaTodosPacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuConsultaTodosPacientesActionPerformed(evt);
            }
        });
        inicio2.add(menuConsultaTodosPacientes);

        menuConsultaPacientePorNome.setText("Pacientes por Nome");
        menuConsultaPacientePorNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuConsultaPacientePorNomeActionPerformed(evt);
            }
        });
        inicio2.add(menuConsultaPacientePorNome);

        menuConsultaPacientePorCPF.setText("Pacientes por CPF");
        menuConsultaPacientePorCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuConsultaPacientePorCPFActionPerformed(evt);
            }
        });
        inicio2.add(menuConsultaPacientePorCPF);

        menuConsultaAniversariantes.setText("Aniversariantes do Mês");
        menuConsultaAniversariantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuConsultaAniversariantesActionPerformed(evt);
            }
        });
        inicio2.add(menuConsultaAniversariantes);
        inicio2.add(jSeparator2);

        menuConsultaTodosDoutores.setText("Consulta Todos Doutores");
        menuConsultaTodosDoutores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuConsultaTodosDoutoresActionPerformed(evt);
            }
        });
        inicio2.add(menuConsultaTodosDoutores);

        menuConsultaDoutoresPorNome.setText("Doutores por Nome");
        menuConsultaDoutoresPorNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuConsultaDoutoresPorNomeActionPerformed(evt);
            }
        });
        inicio2.add(menuConsultaDoutoresPorNome);

        menuConsultaDoutoresPorEspecialidade.setText("Doutores por Especialidade");
        menuConsultaDoutoresPorEspecialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuConsultaDoutoresPorEspecialidadeActionPerformed(evt);
            }
        });
        inicio2.add(menuConsultaDoutoresPorEspecialidade);
        inicio2.add(jSeparator3);

        menuTodasConsultasAgendadas.setText("Todas Consultas Agendadas");
        menuTodasConsultasAgendadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuTodasConsultasAgendadasActionPerformed(evt);
            }
        });
        inicio2.add(menuTodasConsultasAgendadas);

        menuConsultaAtivas.setText("Consultas Ativas");
        menuConsultaAtivas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuConsultaAtivasActionPerformed(evt);
            }
        });
        inicio2.add(menuConsultaAtivas);

        menuConsultasAgendadasParaHoje.setText("Consultas Agendadas para Hoje");
        menuConsultasAgendadasParaHoje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuConsultasAgendadasParaHojeActionPerformed(evt);
            }
        });
        inicio2.add(menuConsultasAgendadasParaHoje);

        menuConsultasAgendadasPorPaciente.setText("Por Paciente");
        menuConsultasAgendadasPorPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuConsultasAgendadasPorPacienteActionPerformed(evt);
            }
        });
        inicio2.add(menuConsultasAgendadasPorPaciente);

        menuConsultaAgendadaPorDoutor.setText("Por Doutor");
        menuConsultaAgendadaPorDoutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuConsultaAgendadaPorDoutorActionPerformed(evt);
            }
        });
        inicio2.add(menuConsultaAgendadaPorDoutor);

        menuConsultaAgendadaPorEspecialidade.setText("Por Especialidade");
        menuConsultaAgendadaPorEspecialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuConsultaAgendadaPorEspecialidadeActionPerformed(evt);
            }
        });
        inicio2.add(menuConsultaAgendadaPorEspecialidade);

        jMenuBar2.add(inicio2);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane2)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane2, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void inputEspecialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputEspecialidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputEspecialidadeActionPerformed

    private void inputCroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputCroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputCroActionPerformed

    private void inputNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputNomeActionPerformed

    private void buttonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCadastrarActionPerformed
        // TODO add your handling code here:
           Constante.doutor.adicionar(cadastrar());
    }//GEN-LAST:event_buttonCadastrarActionPerformed

    private void menuInicio2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuInicio2ActionPerformed
        // TODO add your handling code here:
        InterfacePrincipal i = new InterfacePrincipal();
        this.dispose();
        i.setVisible(true);
    }//GEN-LAST:event_menuInicio2ActionPerformed

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
        InterfaceConsultaAgendadaPorEspecialidade i = new InterfaceConsultaAgendadaPorEspecialidade ();
        this.dispose();
        i.setVisible(true);
    }//GEN-LAST:event_menuConsultaAgendadaPorEspecialidadeActionPerformed

    private void inicio2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inicio2ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_inicio2ActionPerformed

      
                                              

    public Doutor cadastrar() {
        Doutor d = new Doutor();
        DoutorController dControler = new DoutorController();

        d.setNome(inputNome.getText());
        d.setCro(inputCro.getText());
        d.setEspecialidade(inputEspecialidade.getText());
       
        return d;
    }
    
    
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
            java.util.logging.Logger.getLogger(InterfaceCadastroDoutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaceCadastroDoutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaceCadastroDoutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceCadastroDoutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfaceCadastroDoutor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCadastrar;
    private javax.swing.JMenu inicio;
    private javax.swing.JMenu inicio1;
    private javax.swing.JMenu inicio2;
    private javax.swing.JTextField inputCro;
    private javax.swing.JTextField inputEspecialidade;
    private javax.swing.JTextField inputNome;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
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
    private javax.swing.JMenuItem menuInicio1;
    private javax.swing.JMenuItem menuInicio2;
    private javax.swing.JMenuItem menuTodasConsultasAgendadas;
    // End of variables declaration//GEN-END:variables
}
