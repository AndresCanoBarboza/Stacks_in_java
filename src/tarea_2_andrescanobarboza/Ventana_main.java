/*
Universidad Estatal a Distancia
Cátedra de Ingeniería de Software
ORIENTACIÓN ACADÉMICA
Estructura de datos
Código: 00825 Créditos: 3
Grado académico: Diplomado
Encargado de cátedra: Percy Cañipa Valdez
Estudiante Andrés Cano Barboza
Proyecto 1
SEGUNDO CUATRIMESTRE
2021
*/



package tarea_2_andrescanobarboza;

import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

    
public class Ventana_main extends javax.swing.JFrame {

    private Persona[] P_original = new Persona[50];
    private Persona[] P_menores = new Persona[50];
    private Persona[] P_adultos = new Persona[50];
    private Persona[] P_adultoMayor = new Persona[50];
    private Random edad_rand = new Random();
    private Random id_rand = new Random();
    
    
    public Ventana_main() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla_Clasi1 = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabla_Clasi3 = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        tabla_Clasi4 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabla_Clasi2 = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        tabla_Orig = new javax.swing.JTable();
        jScrollPane7 = new javax.swing.JScrollPane();
        tabla_Menor = new javax.swing.JTable();
        jScrollPane8 = new javax.swing.JScrollPane();
        tabla_Adul = new javax.swing.JTable();
        jScrollPane9 = new javax.swing.JScrollPane();
        tabla_Amay = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        generar_pila = new javax.swing.JButton();
        extraccion_menores = new javax.swing.JButton();
        extraccion_adulto_mayor = new javax.swing.JButton();
        extraccion_adultos1 = new javax.swing.JButton();
        Txt_menores = new javax.swing.JTextField();
        Txt_adultos = new javax.swing.JTextField();
        Txt_Amay = new javax.swing.JTextField();
        vaciar_menores = new javax.swing.JButton();
        vaciar_adultos_mayores = new javax.swing.JButton();
        vaciar_adultos = new javax.swing.JButton();
        txt_elementosMen = new javax.swing.JTextField();
        txt_elementosA = new javax.swing.JTextField();
        txt_elementosAM = new javax.swing.JTextField();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        tabla_Clasi1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Todos"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tabla_Clasi1);

        tabla_Clasi3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Todos"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tabla_Clasi3);

        tabla_Clasi4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Todos"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(tabla_Clasi4);

        tabla_Clasi2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Todos"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tabla_Clasi2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabla_Orig.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Pila Original"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane6.setViewportView(tabla_Orig);
        if (tabla_Orig.getColumnModel().getColumnCount() > 0) {
            tabla_Orig.getColumnModel().getColumn(0).setResizable(false);
        }

        tabla_Menor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Menores"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane7.setViewportView(tabla_Menor);
        if (tabla_Menor.getColumnModel().getColumnCount() > 0) {
            tabla_Menor.getColumnModel().getColumn(0).setResizable(false);
        }

        tabla_Adul.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Adultos"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane8.setViewportView(tabla_Adul);
        if (tabla_Adul.getColumnModel().getColumnCount() > 0) {
            tabla_Adul.getColumnModel().getColumn(0).setResizable(false);
        }

        tabla_Amay.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Adultos_Mayores"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane9.setViewportView(tabla_Amay);
        if (tabla_Amay.getColumnModel().getColumnCount() > 0) {
            tabla_Amay.getColumnModel().getColumn(0).setResizable(false);
        }

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Generador y Clasificador de Pilas");

        generar_pila.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        generar_pila.setText("Genere una Pila");
        generar_pila.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generar_pilaActionPerformed(evt);
            }
        });

        extraccion_menores.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        extraccion_menores.setText("Extraiga el último elemento");
        extraccion_menores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                extraccion_menoresActionPerformed(evt);
            }
        });

        extraccion_adulto_mayor.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        extraccion_adulto_mayor.setText("Extraiga el último elemento");
        extraccion_adulto_mayor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                extraccion_adulto_mayorActionPerformed(evt);
            }
        });

        extraccion_adultos1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        extraccion_adultos1.setText("Extraiga el último elemento");
        extraccion_adultos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                extraccion_adultos1ActionPerformed(evt);
            }
        });

        Txt_menores.setEditable(false);
        Txt_menores.setBackground(new java.awt.Color(255, 255, 255));

        Txt_adultos.setEditable(false);
        Txt_adultos.setBackground(new java.awt.Color(255, 255, 255));

        Txt_Amay.setEditable(false);
        Txt_Amay.setBackground(new java.awt.Color(255, 255, 255));

        vaciar_menores.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        vaciar_menores.setText("Vaciar");
        vaciar_menores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vaciar_menoresActionPerformed(evt);
            }
        });

        vaciar_adultos_mayores.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        vaciar_adultos_mayores.setText("Vaciar");
        vaciar_adultos_mayores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vaciar_adultos_mayoresActionPerformed(evt);
            }
        });

        vaciar_adultos.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        vaciar_adultos.setText("Vaciar");
        vaciar_adultos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vaciar_adultosActionPerformed(evt);
            }
        });

        txt_elementosMen.setEditable(false);
        txt_elementosMen.setBackground(new java.awt.Color(255, 255, 255));

        txt_elementosA.setEditable(false);
        txt_elementosA.setBackground(new java.awt.Color(255, 255, 255));

        txt_elementosAM.setEditable(false);
        txt_elementosAM.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(generar_pila, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(extraccion_menores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Txt_menores)
                                    .addComponent(txt_elementosMen)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(extraccion_adultos1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(extraccion_adulto_mayor, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txt_elementosA)
                                            .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(12, 12, 12))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Txt_adultos, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Txt_Amay)
                                    .addComponent(txt_elementosAM)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(495, 495, 495)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(345, 345, 345)
                                .addComponent(vaciar_menores, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(vaciar_adultos, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(vaciar_adultos_mayores, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(extraccion_menores)
                            .addComponent(extraccion_adultos1)
                            .addComponent(extraccion_adulto_mayor))
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Txt_menores, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Txt_adultos, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Txt_Amay, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_elementosMen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_elementosA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_elementosAM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(generar_pila, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(vaciar_menores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(vaciar_adultos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(vaciar_adultos_mayores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void generar_pilaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generar_pilaActionPerformed
    
    // Generacion de pila y su clasificacion automatica e impresion
    
    
    
    vaciar(P_original);
       
        for (int i = 50; i > 0; i--) {
            Push(P_original,new Persona(id_rand.nextInt(99999999)+ 111111111, (edad_rand.nextInt(100)+1)));
        }
    clasificar();
    
    imprimir(P_original,(DefaultTableModel)tabla_Orig.getModel());    
    imprimir(P_menores,(DefaultTableModel)tabla_Menor.getModel());
    imprimir(P_adultos,(DefaultTableModel)tabla_Adul.getModel());
    imprimir(P_adultoMayor,(DefaultTableModel)tabla_Amay.getModel());
   
    txt_elementosMen.setText("La cantidad de Elementos es: " + (getTamano(P_menores)));
    txt_elementosA.setText("La cantidad de Elementos es: " + (getTamano(P_adultos)));
    txt_elementosAM.setText("La cantidad de Elementos es: " + (getTamano(P_adultoMayor)));
    }//GEN-LAST:event_generar_pilaActionPerformed
    
    
    // Botones para extraer
    
    private void extraccion_menoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_extraccion_menoresActionPerformed
       
        if (getTamano(P_original) == 0 || getTamano(P_menores) == 0) {
            JOptionPane.showMessageDialog(null, "Primero debe generar una Pila");
        } else {
        
            Persona extraccion1 = Pop(P_menores);
        imprimir(P_menores,(DefaultTableModel)tabla_Menor.getModel());
        Txt_menores.setText("El número id extraído es: " + extraccion1.getId()+ " -- Edad: " + extraccion1.getEdad());
        txt_elementosMen.setText("La cantidad de Elementos es: " + (getTamano(P_menores)));
        }
    }//GEN-LAST:event_extraccion_menoresActionPerformed
    
    private void extraccion_adultos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_extraccion_adultos1ActionPerformed
        
        if (getTamano(P_original) == 0 || getTamano(P_adultos) == 0) {
            JOptionPane.showMessageDialog(null, "Primero debe generar una Pila");
        } else {
        
        Persona extraccion1 = Pop(P_adultos);
        imprimir(P_adultos,(DefaultTableModel)tabla_Adul.getModel());
        Txt_adultos.setText("El número id extraído es: " + extraccion1.getId() + " -- Edad: " + extraccion1.getEdad());
        txt_elementosA.setText("La cantidad de Elementos es: " + (getTamano(P_adultos)));
        }
    }//GEN-LAST:event_extraccion_adultos1ActionPerformed

    private void extraccion_adulto_mayorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_extraccion_adulto_mayorActionPerformed
       
        if (getTamano(P_original) == 0 || getTamano(P_adultoMayor) == 0) {
            JOptionPane.showMessageDialog(null, "Primero debe generar una Pila");
        } else {
        
        Persona extraccion1 = Pop(P_adultoMayor);
        imprimir(P_adultoMayor,(DefaultTableModel)tabla_Amay.getModel());
        Txt_Amay.setText("El número id extraído es: " + extraccion1.getId()+ " -- Edad: " + extraccion1.getEdad());
        txt_elementosAM.setText("La cantidad de Elementos es: " + (getTamano(P_adultoMayor)));
        }
    }//GEN-LAST:event_extraccion_adulto_mayorActionPerformed
    // Fin de botones para extraer
    
    // Botones vaciar
    
    private void vaciar_menoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vaciar_menoresActionPerformed
       
         if (getTamano(P_original) == 0) {
            JOptionPane.showMessageDialog(null, "Primero debe generar una Pila");
        } else {
        
        vaciar(P_menores);
        imprimir(P_menores,(DefaultTableModel)tabla_Menor.getModel());
        }
         
        txt_elementosMen.setText("La cantidad de Elementos es: " + (getTamano(P_menores))); 
    }//GEN-LAST:event_vaciar_menoresActionPerformed

    private void vaciar_adultosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vaciar_adultosActionPerformed
       
         if (getTamano(P_original) == 0) {
            JOptionPane.showMessageDialog(null, "Primero debe generar una Pila");
        } else {
        
        vaciar(P_adultos);
        imprimir(P_adultos,(DefaultTableModel)tabla_Adul.getModel());
        }
         
        txt_elementosA.setText("La cantidad de Elementos es: " + (getTamano(P_adultos)));
    }//GEN-LAST:event_vaciar_adultosActionPerformed

    private void vaciar_adultos_mayoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vaciar_adultos_mayoresActionPerformed
        
         if (getTamano(P_original) == 0) {
            JOptionPane.showMessageDialog(null, "Primero debe generar una Pila");
        } else {
        
        vaciar(P_adultoMayor);
        imprimir(P_adultoMayor,(DefaultTableModel)tabla_Amay.getModel());
        }
         
        txt_elementosAM.setText("La cantidad de Elementos es: " + (getTamano(P_adultoMayor)));
    }//GEN-LAST:event_vaciar_adultos_mayoresActionPerformed
    // Fin de botones para vaciar
   
    private int getTamano(Persona[] pila) {
        
        int tamano = 0;
        for (Persona persona : pila) {
            if (persona != null) {
                tamano++;
            }
        }
        
    return tamano;
    
    } //Fin tamano
    
    // metodo para el push
    
    private void Push (Persona[] pila, Persona dato) {
            
        int tamano = getTamano(pila);
        
        if (tamano < 50) {
            pila[tamano] = dato;
            tamano++;
        }
        
    } // finPush
    
    // Metodo para sacar
    
    private Persona Pop (Persona[] pila) {
        int tamano = getTamano(pila);
        
            if (tamano != 0) {
                Persona extraccion = pila[tamano - 1];
                pila[tamano - 1] = null;
                tamano--;
                return extraccion;
            }
           
    return null; 
    } // fin Pop
    
    //metodo para vaciar
    
    private void vaciar(Persona[] pila) {
        int tamano = getTamano(pila);
        int i = tamano - 1;
        while (i >= 0) {
            pila[i] = null;
            i--;
        }
    }  //Fin vaciar
    
    //Imprimir objeto
    
    private void imprimir(Persona[] pila, DefaultTableModel tabla) {
        while (tabla.getRowCount() != 0) {
            tabla.removeRow(0);
        }
        //empujar espacios nulos
        
        for (Persona person : pila) {
            if (person == null) {
            tabla.addRow(new Object[] {""});}
        }
        //empujar espacios con datos
        
        for (Persona person : pila) {
            
            if (person != null) {
                tabla.addRow(new Object[] {"Identificación: " + person.getId() + " -- Edad: " + person.getEdad()});
                //} else {
                
               
            }
            
        }
    } //Fin imprimir
    
    // metodo clasificar
    
    private void clasificar () {
        // vaciar para que no se queden los datos en caso de que se quiera hacar otra pila
        vaciar(P_menores);
        vaciar(P_adultos);
        vaciar(P_adultoMayor);
        
        // clonar para no perder la pila original por la extraccion
        
        Persona[] clonO = P_original.clone();
        
        for (int i = 50; i > 0; i--) {
            Persona extraccion = Pop(clonO);
            
            if (extraccion.getEdad() > 64) {
                Push(P_adultoMayor, extraccion);
            } else if (extraccion.getEdad() < 64 && extraccion.getEdad()>18) {
                Push(P_adultos, extraccion);     
              } else {
                Push(P_menores, extraccion);
                }
        }
            
        
    } // Fin clasi
    
    
    
    public static void main(String args[]) {
        
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana_main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Txt_Amay;
    private javax.swing.JTextField Txt_adultos;
    private javax.swing.JTextField Txt_menores;
    private javax.swing.JButton extraccion_adulto_mayor;
    private javax.swing.JButton extraccion_adultos1;
    private javax.swing.JButton extraccion_menores;
    private javax.swing.JButton generar_pila;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTable tabla_Adul;
    private javax.swing.JTable tabla_Amay;
    private javax.swing.JTable tabla_Clasi1;
    private javax.swing.JTable tabla_Clasi2;
    private javax.swing.JTable tabla_Clasi3;
    private javax.swing.JTable tabla_Clasi4;
    private javax.swing.JTable tabla_Menor;
    private javax.swing.JTable tabla_Orig;
    private javax.swing.JTextField txt_elementosA;
    private javax.swing.JTextField txt_elementosAM;
    private javax.swing.JTextField txt_elementosMen;
    private javax.swing.JButton vaciar_adultos;
    private javax.swing.JButton vaciar_adultos_mayores;
    private javax.swing.JButton vaciar_menores;
    // End of variables declaration//GEN-END:variables
}

/*
Referencias

https://www.youtube.com/watch?v=CDzc0EBgtuk&list=PLs_fw8DVyMBLH19Y1aUZssKHxsiZaL8i9&index=2&t=33s
https://www.youtube.com/watch?v=MekGqrrWNiM
https://www.youtube.com/watch?v=oaPtIqh6ggM
https://www.youtube.com/watch?v=4QTlVJNf6S8
https://www.youtube.com/watch?v=OZA8JNf6mjo
https://www.youtube.com/watch?v=zPJ5KhfrcyQ
http://chuwiki.chuidiang.org/index.php?title=Generar_n%C3%BAmeros_aleatorios_en_Java
https://yoandroide.xyz/generar-numeros-aleatorios-no-repetidos-en-java/
https://www.youtube.com/watch?v=oaPtIqh6ggM&t=113s
https://www.youtube.com/watch?v=i78mrz3nk7k
https://www.youtube.com/watch?v=i78mrz3nk7k
https://www.youtube.com/watch?v=zPJ5KhfrcyQ&t=869s
https://www.tutorialesprogramacionya.com/javaya/detalleconcepto.php?codigo=115&punto=&inicio=40
https://www.youtube.com/watch?v=yU80zB-WDnM


*/