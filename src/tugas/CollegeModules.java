package tugas;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import java.util.List;

public class CollegeModules extends JFrame {
    private JTextField inputNama;
    private JTextField inputNim;
    private JRadioButton sistemInformasiRadioButton;
    private JRadioButton teknikInformatikaRadioButton;
    private JSpinner spinnerTanggalLahir;
    private JTextField inputKodeMataKuliah;
    private JTextField inputMataKuliah;
    private JTextField inputSKS;
    private JLabel mahasiswa;
    private JTable tableList;
    private JButton newStudentButton;
    private JButton newSubjectButton;
    private JButton viewDataStudent;
    private JButton exitButton;
    private JPanel mainPanel;
    private JButton viewDataMataKuliah;

    private List<Mahasiswa> mahasiswaList = new ArrayList<>();
    private List<Subject> mataKuliahList = new ArrayList<>();
    public CollegeModules() {
        setContentPane(mainPanel);
        setTitle("College Modules");
        setSize(1000, 1000);
        setVisible(true);

        setEnableStudentForm(false);
        setEnableSubjectForm(false);

        newStudentButton.addActionListener(e -> {

            if (newStudentButton.getText().equals("New Student")) {
                setEnableStudentForm(true);
                return;
            } else {
                setEnableStudentForm(false);

                String name = inputNama.getText();
                int dob = (int) spinnerTanggalLahir.getValue();
                String major = sistemInformasiRadioButton.isSelected() ? "Sistem Informasi" : "Teknik Informatika";
                int nim = Integer.parseInt(inputNim.getText());
                Mahasiswa mahasiswa = new Mahasiswa(name, 1, major, nim, dob);

                if (mahasiswaList.stream().anyMatch(m -> m.getNim() == nim)) {
                    JOptionPane.showMessageDialog(this, "NIM sudah terdaftar, silahkan masukkan NIM lain");
                    return;
                }

                mahasiswaList.add(mahasiswa);
                inputNama.setText("");
                spinnerTanggalLahir.setValue(0);
                inputNim.setText("");
                sistemInformasiRadioButton.setSelected(false);
                teknikInformatikaRadioButton.setSelected(false);
                setEnableStudentForm(false);
            }

        });

        newSubjectButton.addActionListener(e -> {

            if (newSubjectButton.getText().equals("New Subject")) {
                setEnableSubjectForm(true);
                return;
            } else {
                setEnableSubjectForm(false);

                String id = inputKodeMataKuliah.getText();
                String nama = inputMataKuliah.getText();
                int sks = Integer.parseInt(inputSKS.getText());
                Subject subject = new Subject(id, nama, sks);

                if (mataKuliahList.stream().anyMatch(m -> m.getId().equals(id))) {
                    JOptionPane.showMessageDialog(this, "Kode Mata Kuliah sudah terdaftar, silahkan masukkan Kode Mata Kuliah lain");
                    return;
                }

                mataKuliahList.add(subject);
                inputKodeMataKuliah.setText("");
                inputMataKuliah.setText("");
                inputSKS.setText("");
                setEnableSubjectForm(false);
            }

        });

        viewDataStudent.addActionListener(e -> {
            setEnableStudentForm(false);
            setEnableSubjectForm(false);
            DefaultTableModel model = (DefaultTableModel) tableList.getModel();
            viewDataStudent();
        });

        viewDataMataKuliah.addActionListener(e -> {
            setEnableStudentForm(false);
            setEnableSubjectForm(false);
            DefaultTableModel model = (DefaultTableModel) tableList.getModel();
            viewDataMataKuliah();
        });

        exitButton.addActionListener(e -> {
            System.exit(0);
        });
    }

    public void viewDataStudent() {
        String[] columnNames = {"NIM", "Nama", "Jurusan", "Tanggal Lahir"};
        Object[][] data = new Object[mahasiswaList.size()][4];
        for (int i = 0; i < mahasiswaList.size(); i++) {
            Mahasiswa mahasiswa = mahasiswaList.get(i);
            data[i][0] = mahasiswa.getNim();
            data[i][1] = mahasiswa.getName();
            data[i][2] = mahasiswa.getMajor();
            data[i][3] = mahasiswa.getDateOfBirth();
        }
        tableList.setModel(new DefaultTableModel(data, columnNames));
    }

    public void viewDataMataKuliah() {
        String[] columnNames = {"Kode Mata Kuliah", "Nama Mata Kuliah", "SKS"};
        Object[][] data = new Object[mataKuliahList.size()][3];
        for (int i = 0; i < mataKuliahList.size(); i++) {
            Subject subject = mataKuliahList.get(i);
            data[i][0] = subject.getId();
            data[i][1] = subject.getName();
            data[i][2] = subject.getSks();
        }
        tableList.setModel(new DefaultTableModel(data, columnNames));
    }

    public void setEnableStudentForm(boolean enable) {
        if (enable) {
            newStudentButton.setText("Save Student");
            newSubjectButton.setText("New Subject");
            inputNim.requestFocus();
        } else {
            newStudentButton.setText("New Student");
        }
        inputNama.setEnabled(enable);
        spinnerTanggalLahir.setEnabled(enable);
        inputNim.setEnabled(enable);
        sistemInformasiRadioButton.setEnabled(enable);
        teknikInformatikaRadioButton.setEnabled(enable);
    }

    public void setEnableSubjectForm(boolean enable) {
        if (enable) {
            newSubjectButton.setText("Save Subject");
            newStudentButton.setText("New Student");
            inputKodeMataKuliah.requestFocus();
        } else {
            newSubjectButton.setText("New Subject");
        }
        inputKodeMataKuliah.setEnabled(enable);
        inputMataKuliah.setEnabled(enable);
        inputSKS.setEnabled(enable);
    }

    public static void main(String[] args) {
        new CollegeModules();
    }
}
