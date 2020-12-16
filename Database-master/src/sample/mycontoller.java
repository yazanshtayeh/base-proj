package sample;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;

import java.sql.*;

public class mycontoller {


    public Pane addpane;
    public Pane viewpane;
    public Pane welcomepane;
    public Pane SearchPane;
    public Pane peopleaddpane;
    public Pane governmentalcarsaddpane;
    public Pane publiccarsaddpane;
    public Pane privatecarsaddpane;
    public Pane workshopsaddpane;
    public Pane cargalleriesaddpane;
    public Pane inspectioncentersaddpane;
    public Pane drivingschoolsaddpane;
    public Pane taxiofficeaddpane;
    public StackPane stackpaneadd;
    public Pane peopleviewpane;
    public Pane cargalleriesviewpane;
    public Pane privatecarsviewpane;
    public Pane governmentalviewpane;
    public Pane publiccarsviewpane;
    public Pane workshopsviewpane;
    public Pane drivingschoolsviewpane;
    public Pane inspectioncentersviewpane;
    public Pane taxiviewpane;
    public StackPane stackpaneview;
    public Label searchbtn;
    public Label updatetnb;
    public Button searchsubmitbutton;


    public void addbtnmouseclicked(MouseEvent mouseEvent) {
        viewpane.setVisible(false);
        SearchPane.setVisible(false);
        welcomepane.setVisible(false);
        addpane.setVisible(true);
            stackpaneview.setVisible(false);
            stackpaneadd.setVisible(true);
                governmentalcarsaddpane.setVisible(false);
                cargalleriesaddpane.setVisible(false);
                drivingschoolsaddpane.setVisible(false);
                inspectioncentersaddpane.setVisible(false);
                peopleaddpane.setVisible(true);
                privatecarsaddpane.setVisible(false);
                publiccarsaddpane.setVisible(false);
                workshopsaddpane.setVisible(false);
                taxiofficeaddpane.setVisible(false);

    }

    public void viewbtnmouseclicked(MouseEvent mouseEvent) {
        addpane.setVisible(false);
        viewpane.setVisible(true);
        SearchPane.setVisible(false);
        welcomepane.setVisible(false);
            stackpaneview.setVisible(true);
            stackpaneadd.setVisible(false);
                peopleviewpane.setVisible(true);
                cargalleriesviewpane.setVisible(false);
                governmentalviewpane.setVisible(false);
                publiccarsviewpane.setVisible(false);
                privatecarsviewpane.setVisible(false);
                workshopsviewpane.setVisible(false);
                inspectioncentersviewpane.setVisible(false);
                taxiviewpane.setVisible(false);
                drivingschoolsviewpane.setVisible(false);



    }

    public void searchbtnmouseclicked(MouseEvent mouseEvent) {
        addpane.setVisible(false);
        viewpane.setVisible(false);
        welcomepane.setVisible(false);
        SearchPane.setVisible(true);

    }

    public void updatebtnmouseclicked(MouseEvent mouseEvent) {
        addpane.setVisible(false);
        viewpane.setVisible(false);
        welcomepane.setVisible(false);
        SearchPane.setVisible(false);
    }

    public void dvlmouseclicked(MouseEvent mouseEvent) {
        addpane.setVisible(false);
        viewpane.setVisible(false);
        welcomepane.setVisible(true);

    }

    public void peopleaddbtnclicked(MouseEvent mouseEvent) {
        governmentalcarsaddpane.setVisible(false);
        cargalleriesaddpane.setVisible(false);
        drivingschoolsaddpane.setVisible(false);
        inspectioncentersaddpane.setVisible(false);
        peopleaddpane.setVisible(true);
        privatecarsaddpane.setVisible(false);
        publiccarsaddpane.setVisible(false);
        workshopsaddpane.setVisible(false);
        taxiofficeaddpane.setVisible(false);
    }

    public void galleriesaddbtnclicked(MouseEvent mouseEvent) {
        governmentalcarsaddpane.setVisible(false);
        cargalleriesaddpane.setVisible(true);
        drivingschoolsaddpane.setVisible(false);
        inspectioncentersaddpane.setVisible(false);
        peopleaddpane.setVisible(false);
        privatecarsaddpane.setVisible(false);
        publiccarsaddpane.setVisible(false);
        workshopsaddpane.setVisible(false);
        taxiofficeaddpane.setVisible(false);

    }

    public void privateaddbtnclicked(MouseEvent mouseEvent) {
        governmentalcarsaddpane.setVisible(false);
        cargalleriesaddpane.setVisible(false);
        drivingschoolsaddpane.setVisible(false);
        inspectioncentersaddpane.setVisible(false);
        peopleaddpane.setVisible(false);
        privatecarsaddpane.setVisible(true);
        publiccarsaddpane.setVisible(false);
        workshopsaddpane.setVisible(false);
        taxiofficeaddpane.setVisible(false);

    }

    public void goveaddbtnclicked(MouseEvent mouseEvent) {
        governmentalcarsaddpane.setVisible(true);
        cargalleriesaddpane.setVisible(false);
        drivingschoolsaddpane.setVisible(false);
        inspectioncentersaddpane.setVisible(false);
        peopleaddpane.setVisible(false);
        privatecarsaddpane.setVisible(false);
        publiccarsaddpane.setVisible(false);
        workshopsaddpane.setVisible(false);
        taxiofficeaddpane.setVisible(false);
    }

    public void publicaddbtnclicked(MouseEvent mouseEvent) {
        governmentalcarsaddpane.setVisible(false);
        cargalleriesaddpane.setVisible(false);
        drivingschoolsaddpane.setVisible(false);
        inspectioncentersaddpane.setVisible(false);
        peopleaddpane.setVisible(false);
        privatecarsaddpane.setVisible(false);
        publiccarsaddpane.setVisible(true);
        workshopsaddpane.setVisible(false);
        taxiofficeaddpane.setVisible(false);
    }

    public void taxiaddbtnclicked(MouseEvent mouseEvent) {
        governmentalcarsaddpane.setVisible(false);
        cargalleriesaddpane.setVisible(false);
        drivingschoolsaddpane.setVisible(false);
        inspectioncentersaddpane.setVisible(false);
        peopleaddpane.setVisible(false);
        privatecarsaddpane.setVisible(false);
        publiccarsaddpane.setVisible(false);
        workshopsaddpane.setVisible(false);
        taxiofficeaddpane.setVisible(true);
    }

    public void workshopaddbtnclicked(MouseEvent mouseEvent) {
        governmentalcarsaddpane.setVisible(false);
        cargalleriesaddpane.setVisible(false);
        drivingschoolsaddpane.setVisible(false);
        inspectioncentersaddpane.setVisible(false);
        peopleaddpane.setVisible(false);
        privatecarsaddpane.setVisible(false);
        publiccarsaddpane.setVisible(false);
        workshopsaddpane.setVisible(true);
        taxiofficeaddpane.setVisible(false);
    }

    public void schoolsaddbtnclicked(MouseEvent mouseEvent) {
        governmentalcarsaddpane.setVisible(false);
        cargalleriesaddpane.setVisible(false);
        drivingschoolsaddpane.setVisible(true);
        inspectioncentersaddpane.setVisible(false);
        peopleaddpane.setVisible(false);
        privatecarsaddpane.setVisible(false);
        publiccarsaddpane.setVisible(false);
        workshopsaddpane.setVisible(false);
        taxiofficeaddpane.setVisible(false);
    }

    public void inspectionaddbtnclicked(MouseEvent mouseEvent) {
        governmentalcarsaddpane.setVisible(false);
        cargalleriesaddpane.setVisible(false);
        drivingschoolsaddpane.setVisible(false);
        inspectioncentersaddpane.setVisible(true);
        peopleaddpane.setVisible(false);
        privatecarsaddpane.setVisible(false);
        publiccarsaddpane.setVisible(false);
        workshopsaddpane.setVisible(false);
        taxiofficeaddpane.setVisible(false);
    }
    //viewing people
    @FXML
    private TableView<person> ptableview;

    @FXML
    private TableColumn<person, Integer> ssncol;

    @FXML
    private TableColumn<person, String> namecol;

    @FXML
    private TableColumn<person, Integer> idcol;

    @FXML
    private TableColumn<person, Date> bdcol;

    @FXML
    private TableColumn<person, Date> edcol;


    public void peoplebtnbviewpaneclicked(MouseEvent mouseEvent) {
        peopleviewpane.setVisible(true);
        cargalleriesviewpane.setVisible(false);
        governmentalviewpane.setVisible(false);
        publiccarsviewpane.setVisible(false);
        privatecarsviewpane.setVisible(false);
        workshopsviewpane.setVisible(false);
        inspectioncentersviewpane.setVisible(false);
        taxiviewpane.setVisible(false);
        drivingschoolsviewpane.setVisible(false);

        for ( int i = 0; i<ptableview.getItems().size(); i++) {
            ptableview.getItems().clear();
        }

        try {
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
            Connection con = DriverManager.getConnection(url, "proj", "123456");
            Statement stm = con.createStatement();
            String sss;
            //checking the boxess
            String lp;
            String pptl;
            String pppc;
            String gd;
            String daa;
            String pm;
            String i;
            String gggg;
            String ddvv;


            ssncol.setCellValueFactory(new PropertyValueFactory<>("Ssn"));
            namecol.setCellValueFactory(new PropertyValueFactory<>("Name"));
            idcol.setCellValueFactory(new PropertyValueFactory<>("Id"));
            bdcol.setCellValueFactory(new PropertyValueFactory<>("Birthdate"));
            edcol.setCellValueFactory(new PropertyValueFactory<>("Expiredate"));

            sss = "select * from people";

            ResultSet rst = stm.executeQuery(sss);
            while (rst.next()) {

                person x = new person(rst.getInt(1), rst.getInt(2), rst.getString(3), rst.getDate(4), rst.getDate(5));
                ptableview.getItems().add(x);
            }
            con.commit();
            con.close();


        } catch (Exception throwables) {
            alertbox.display("An error happened", "Please make sure that the ownerssn is for an existing person \n and the plate  number and the premit number are unique");
        }
    }

    public void cargalleriesbtnbviewpaneclicked(MouseEvent mouseEvent) {
        peopleviewpane.setVisible(false);
        cargalleriesviewpane.setVisible(true);
        governmentalviewpane.setVisible(false);
        publiccarsviewpane.setVisible(false);
        privatecarsviewpane.setVisible(false);
        workshopsviewpane.setVisible(false);
        inspectioncentersviewpane.setVisible(false);
        taxiviewpane.setVisible(false);
        drivingschoolsviewpane.setVisible(false);
    }

    public void privatecarsbtnbviewpaneclicked(MouseEvent mouseEvent) {
        peopleviewpane.setVisible(false);
        cargalleriesviewpane.setVisible(false);
        governmentalviewpane.setVisible(false);
        publiccarsviewpane.setVisible(false);
        privatecarsviewpane.setVisible(true);
        workshopsviewpane.setVisible(false);
        inspectioncentersviewpane.setVisible(false);
        taxiviewpane.setVisible(false);
        drivingschoolsviewpane.setVisible(false);
    }

    public void governmentalbtnbviewpaneclicked(MouseEvent mouseEvent) {
        peopleviewpane.setVisible(false);
        cargalleriesviewpane.setVisible(false);
        governmentalviewpane.setVisible(true);
        publiccarsviewpane.setVisible(false);
        privatecarsviewpane.setVisible(false);
        workshopsviewpane.setVisible(false);
        inspectioncentersviewpane.setVisible(false);
        taxiviewpane.setVisible(false);
        drivingschoolsviewpane.setVisible(false);
    }

    public void publiccarsbtnbviewpaneclicked(MouseEvent mouseEvent) {
        peopleviewpane.setVisible(false);
        cargalleriesviewpane.setVisible(false);
        governmentalviewpane.setVisible(false);
        publiccarsviewpane.setVisible(true);
        privatecarsviewpane.setVisible(false);
        workshopsviewpane.setVisible(false);
        inspectioncentersviewpane.setVisible(false);
        taxiviewpane.setVisible(false);
        drivingschoolsviewpane.setVisible(false);
    }

    public void workshopsbtnbviewpaneclicked(MouseEvent mouseEvent) {
        peopleviewpane.setVisible(false);
        cargalleriesviewpane.setVisible(false);
        governmentalviewpane.setVisible(false);
        publiccarsviewpane.setVisible(false);
        privatecarsviewpane.setVisible(false);
        workshopsviewpane.setVisible(true);
        inspectioncentersviewpane.setVisible(false);
        taxiviewpane.setVisible(false);
        drivingschoolsviewpane.setVisible(false);
    }

    public void drivingschoolsbtnbviewpaneclicked(MouseEvent mouseEvent) {
        peopleviewpane.setVisible(false);
        cargalleriesviewpane.setVisible(false);
        governmentalviewpane.setVisible(false);
        publiccarsviewpane.setVisible(false);
        privatecarsviewpane.setVisible(false);
        workshopsviewpane.setVisible(false);
        inspectioncentersviewpane.setVisible(false);
        taxiviewpane.setVisible(false);
        drivingschoolsviewpane.setVisible(true);
    }

    public void inspectioncentersbtnbviewpaneclicked(MouseEvent mouseEvent) {
        peopleviewpane.setVisible(false);
        cargalleriesviewpane.setVisible(false);
        governmentalviewpane.setVisible(false);
        publiccarsviewpane.setVisible(false);
        privatecarsviewpane.setVisible(false);
        workshopsviewpane.setVisible(false);
        inspectioncentersviewpane.setVisible(true);
        taxiviewpane.setVisible(false);
        drivingschoolsviewpane.setVisible(false);
    }

    public void taxibtnbviewpaneclicked(MouseEvent mouseEvent) {
        peopleviewpane.setVisible(false);
        cargalleriesviewpane.setVisible(false);
        governmentalviewpane.setVisible(false);
        publiccarsviewpane.setVisible(false);
        privatecarsviewpane.setVisible(false);
        workshopsviewpane.setVisible(false);
        inspectioncentersviewpane.setVisible(false);
        taxiviewpane.setVisible(true);
        drivingschoolsviewpane.setVisible(false);
    }

    public void submitSearchBtnClicked(MouseEvent mouseEvent) {

    }
    //for adding people
    @FXML
    private TextField idtxt;
    @FXML
    private TextField nametxt;
    @FXML
    private TextField birthtxt;
    @FXML
    private TextField expire_date;
    String url="jdbc:oracle:thin:@localhost:1521:orcl";

    public void clickedsave (MouseEvent mouseEvent ){
        try {
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
            Connection con=DriverManager.getConnection(url,"proj","123456");
            Statement stm=con.createStatement();
            String sss;
            String id= idtxt.getText();
            String name= nametxt.getText();
            String birthdate=birthtxt.getText();
            String expiredate=expire_date.getText();
            sss = "insert into people values (pn.nextval,"+id+",'"+name+"',date'"+birthdate+"',date'"+expiredate+"')";
            stm.executeUpdate(sss);
            con.commit();
            con.close();
            alertbox.display("Person added","added successfully");
            idtxt.clear();
            nametxt.clear();
            birthtxt.clear();
            expire_date.clear();
        } catch (Exception throwables) {
            alertbox.display("An error happened","Please make sure that the id is unique \n and the date enterd is in this format YYYY-MM-DD");
        }
    }
    //adding car galleries
    @FXML
    private TextField gidtxt;

    @FXML
    private TextField gnametxt;

    @FXML
    private CheckBox gtrac;

    @FXML
    private CheckBox gror;

    @FXML
    private CheckBox gaa;

    @FXML
    private CheckBox gpa;

    @FXML
    private CheckBox glhb;

    @FXML
    private CheckBox gmol;

    @FXML
    private CheckBox gmp;

    @FXML
    private CheckBox gsb;

    @FXML
    private CheckBox ghtc;

    @FXML
    private CheckBox gafto;

    @FXML
    private CheckBox gla;


    public void clickedcrsave (MouseEvent mouseEvent ){
        try {
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
            Connection con=DriverManager.getConnection(url,"proj","123456");
            Statement stm=con.createStatement();
            String sss;
            String id= gidtxt.getText();
            String name= gnametxt.getText();
            //checking the boxess
            String trac;
            String ror;
            String aa;
            String pa;
            String lhb;
            String mol;
            String mp;
            String sb;
            String htc;
            String afto;
            String la;

            if(gtrac.isSelected())
                trac="available";
            else trac = "N/A";

            if(gror.isSelected())
                ror="availabe";
            else ror="N/A";

            if(gaa.isSelected())
                aa="availabe";
            else aa="N/A";

            if(gpa.isSelected())
                pa="availabe";
            else pa="N/A";

            if(glhb.isSelected())
                lhb="availabe";
            else lhb="N/A";

            if(gmol.isSelected())
                mol="availabe";
            else mol="N/A";

            if(gmp.isSelected())
                mp="availabe";
            else mp="N/A";

            if(gsb.isSelected())
                sb="availabe";
            else sb="N/A";

            if(ghtc.isSelected())
                htc="availabe";
            else htc="N/A";

            if(gafto.isSelected())
                afto="availabe";
            else afto="N/A";

            if(gla.isSelected())
                la="availabe";
            else la="N/A";

            sss = "insert into car_galleries values (cr.nextval,"+id+",'"+name+"','"+trac+"','"+ror+"','"+aa+"','"+pa+"','"+lhb+"','"+mol+"','"+mp+"','"+sb+"','"+htc+"','"+afto+"','"+la+"')";
            stm.executeUpdate(sss);
            con.commit();
            con.close();
            alertbox.display("Car Galleries","added successfully");
            gidtxt.clear();
            gnametxt.clear();
            gtrac.setSelected(false);
            gror.setSelected(false);
            gaa.setSelected(false);
            gpa.setSelected(false);
            glhb.setSelected(false);
            gmol.setSelected(false);
            gmp.setSelected(false);
            gsb.setSelected(false);
            ghtc.setSelected(false);
            gafto.setSelected(false);
            gla.setSelected(false);
        } catch (Exception throwables) {
            alertbox.display("An error happened","Please make sure that the ownerssn is for an existing person ");
        }

    }
    //for adding inspection centers
    @FXML
    private TextField iidtxt;

    @FXML
    private TextField inametxt;

    @FXML
    private CheckBox itrac;

    @FXML
    private CheckBox ipor;

    @FXML
    private CheckBox iaa;

    @FXML
    private CheckBox ipa;

    @FXML
    private CheckBox imol;

    @FXML
    private CheckBox imd;

    @FXML
    private CheckBox isb;

    @FXML
    private CheckBox ihtc;

    @FXML
    private CheckBox iafto;

    @FXML
    private CheckBox ila;

    @FXML
    private CheckBox iidwp;

    @FXML
    private CheckBox ies;

    @FXML
    private CheckBox icb;

    @FXML
    private CheckBox iecp;

    @FXML
    private CheckBox ipupl;



    public void clickedicsave (MouseEvent mouseEvent ){
        try {
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
            Connection con=DriverManager.getConnection(url,"proj","123456");
            Statement stm=con.createStatement();
            String sss;
            String id= iidtxt.getText();
            String name= inametxt.getText();
            //checking the boxess
            String trac;
            String por;
            String aa;
            String pa;
            String mol;
            String md;
            String sb;
            String htc;
            String afto;
            String la;
            String idwp;
            String es;
            String cb;
            String ecp;
            String pupl;


            if(itrac.isSelected())
                trac="available";
            else trac = "N/A";

            if(ipor.isSelected())
                por="availabe";
            else por="N/A";

            if(iaa.isSelected())
                aa="availabe";
            else aa="N/A";

            if(ipa.isSelected())
                pa="availabe";
            else pa="N/A";

            if(imol.isSelected())
                mol="availabe";
            else mol="N/A";

            if(imd.isSelected())
                md="availabe";
            else md="N/A";

            if(isb.isSelected())
                sb="availabe";
            else sb="N/A";

            if(ihtc.isSelected())
                htc="availabe";
            else htc="N/A";

            if(iafto.isSelected())
                afto="availabe";
            else afto="N/A";

            if(iidwp.isSelected())
                idwp="availabe";
            else idwp="N/A";

            if(ies.isSelected())
                es="availabe";
            else es="N/A";

            if(icb.isSelected())
                cb="availabe";
            else cb="N/A";

            if(iecp.isSelected())
                ecp="availabe";
            else ecp="N/A";

            if(ipupl.isSelected())
                pupl="availabe";
            else pupl="N/A";

            if(ila.isSelected())
                la="availabe";
            else la="N/A";

            sss = "insert into inspection_centers values (ic.nextval,"+id+",'"+name+"','"+trac+"','"+por+"','"+aa+"','"+pa+"','"+mol+"','"+md+"','"+sb+"','"+htc+"','"+afto+"','"+idwp+"','"+es+"','"+cb+"','"+ecp+"','"+pupl+"','"+la+"')";
            stm.executeUpdate(sss);
            con.commit();
            con.close();
            alertbox.display("Inspection Centers","added successfully");
            iidtxt.clear();
            inametxt.clear();
            itrac.setSelected(false);
            ipor.setSelected(false);
            iaa.setSelected(false);
            ipa.setSelected(false);
            imol.setSelected(false);
            imd.setSelected(false);
            isb.setSelected(false);
            ihtc.setSelected(false);
            iafto.setSelected(false);
            iidwp.setSelected(false);
            ies.setSelected(false);
            icb.setSelected(false);
            iecp.setSelected(false);
            ipupl.setSelected(false);
            ila.setSelected(false);

        } catch (Exception throwables) {
            alertbox.display("An error happened","Please make sure that the ownerssn is for an existing person ");
        }

    }
    //adding workshops
    @FXML
    private TextField widtxt;

    @FXML
    private TextField wnametxt;

    @FXML
    private CheckBox wtrac;

    @FXML
    private CheckBox wpor;

    @FXML
    private CheckBox waa;

    @FXML
    private CheckBox wpa;

    @FXML
    private CheckBox wmol;

    @FXML
    private CheckBox wpd;

    @FXML
    private CheckBox wsb;

    @FXML
    private CheckBox whtc;

    @FXML
    private CheckBox wafto;

    @FXML
    private CheckBox wla;


    public void clickedwssave (MouseEvent mouseEvent ){
        try {
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
            Connection con=DriverManager.getConnection(url,"proj","123456");
            Statement stm=con.createStatement();
            String sss;
            String id= widtxt.getText();
            String name= wnametxt.getText();
            //checking the boxess
            String trac;
            String por;
            String aa;
            String pa;
            String mol;
            String md;
            String sb;
            String htc;
            String afto;
            String la;



            if(wtrac.isSelected())
                trac="available";
            else trac = "N/A";

            if(wpor.isSelected())
                por="availabe";
            else por="N/A";

            if(waa.isSelected())
                aa="availabe";
            else aa="N/A";

            if(wpa.isSelected())
                pa="availabe";
            else pa="N/A";

            if(wmol.isSelected())
                mol="availabe";
            else mol="N/A";

            if(wpd.isSelected())
                md="availabe";
            else md="N/A";

            if(wsb.isSelected())
                sb="availabe";
            else sb="N/A";

            if(whtc.isSelected())
                htc="availabe";
            else htc="N/A";

            if(wafto.isSelected())
                afto="availabe";
            else afto="N/A";

            if(wla.isSelected())
                la="availabe";
            else la="N/A";

            sss = "insert into workshops values (ws.nextval,"+id+",'"+name+"','"+trac+"','"+por+"','"+aa+"','"+pa+"','"+mol+"','"+md+"','"+sb+"','"+htc+"','"+afto+"','"+la+"')";
            stm.executeUpdate(sss);
            con.commit();
            con.close();
            alertbox.display("Workshops","added successfully");
            widtxt.clear();
            wnametxt.clear();
            wtrac.setSelected(false);
            wpor.setSelected(false);
            waa.setSelected(false);
            wpa.setSelected(false);
            wmol.setSelected(false);
            wpd.setSelected(false);
            wsb.setSelected(false);
            whtc.setSelected(false);
            wafto.setSelected(false);
            wla.setSelected(false);

        } catch (Exception throwables) {
            alertbox.display("An error happened","Please make sure that the ownerssn is for an existing person ");
        }

    }
    //adding driving schools
    @FXML
    private TextField didtxt;

    @FXML
    private TextField dnametxt;

    @FXML
    private CheckBox dlp;

    @FXML
    private CheckBox dpptl;

    @FXML
    private CheckBox dpppc;

    @FXML
    private CheckBox dgd;

    @FXML
    private CheckBox dpm;

    @FXML
    private CheckBox daa;


    public void clickeddssave (MouseEvent mouseEvent ){
        try {
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
            Connection con=DriverManager.getConnection(url,"proj","123456");
            Statement stm=con.createStatement();
            String sss;
            String id= didtxt.getText();
            String name= dnametxt.getText();
            //checking the boxess
            String lp;
            String pptl;
            String pppc;
            String gd;
            String aa;
            String pm;



            if(dlp.isSelected())
                lp="available";
            else lp = "N/A";

            if(dpptl.isSelected())
                pptl="availabe";
            else pptl="N/A";

            if(dpppc.isSelected())
                pppc="availabe";
            else pppc="N/A";

            if(dgd.isSelected())
                gd="availabe";
            else gd="N/A";

            if(daa.isSelected())
                aa="availabe";
            else aa="N/A";

            if(dpm.isSelected())
                pm="availabe";
            else pm="N/A";


            sss = "insert into driving_schools values (ws.nextval,"+id+",'"+name+"','"+lp+"','"+pptl+"','"+pppc+"','"+gd+"','"+aa+"','"+pm+"')";
            stm.executeUpdate(sss);
            con.commit();
            con.close();
            alertbox.display("driving schools","added successfully");
            didtxt.clear();
            dnametxt.clear();
            dlp.setSelected(false);
            dpptl.setSelected(false);
            dpppc.setSelected(false);
            dgd.setSelected(false);
            daa.setSelected(false);
            dpm.setSelected(false);

        } catch (Exception throwables) {
            alertbox.display("An error happened","Please make sure that the ownerssn is for an existing person ");
        }

    }
    //adding taxis offices
    @FXML
    private TextField tidtxt;

    @FXML
    private TextField tnametxt;

    @FXML
    private CheckBox tcgc;

    @FXML
    private CheckBox tpor;

    @FXML
    private CheckBox tpppc;

    @FXML
    private CheckBox tccr;

    @FXML
    private CheckBox tmd;

    @FXML
    private CheckBox taa;


    public void clickedtosave (MouseEvent mouseEvent ){
        try {
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
            Connection con=DriverManager.getConnection(url,"proj","123456");
            Statement stm=con.createStatement();
            String sss;
            String id= tidtxt.getText();
            String name= tnametxt.getText();
            //checking the boxess
            String lp;
            String pptl;
            String pppc;
            String gd;
            String daa;
            String pm;

            if(tcgc.isSelected())
                lp="available";
            else lp = "N/A";

            if(tpor.isSelected())
                pptl="availabe";
            else pptl="N/A";

            if(tpppc.isSelected())
                pppc="availabe";
            else pppc="N/A";

            if(tccr.isSelected())
                gd="availabe";
            else gd="N/A";

            if(taa.isSelected())
                daa="availabe";
            else daa="N/A";

            if(tmd.isSelected())
                pm="availabe";
            else pm="N/A";



            sss = "insert into taxi_office values (ta.nextval,"+id+",'"+name+"','"+lp+"','"+pptl+"','"+pppc+"','"+gd+"','"+daa+"','"+pm+"')";
            stm.executeUpdate(sss);
            con.commit();
            con.close();
            alertbox.display("Taxi Office","added successfully");
            tidtxt.clear();
            tnametxt.clear();
            tcgc.setSelected(false);
            tpor.setSelected(false);
            tpppc.setSelected(false);
            tccr.setSelected(false);
            taa.setSelected(false);
            tmd.setSelected(false);


        } catch (Exception throwables) {
            alertbox.display("An error happened","Please make sure that the ownerssn is for an existing person ");
        }

    }
    //adding private cars
    @FXML
    private TextField pidtxt;

    @FXML
    private TextField platetxt;

    @FXML
    private CheckBox pnoc;

    @FXML
    private CheckBox psc;

    @FXML
    private CheckBox pds;

    @FXML
    private CheckBox pta;

    @FXML
    private CheckBox pl;

    @FXML
    private CheckBox pti;

    @FXML
    private CheckBox pi;


    public void clickedprsave (MouseEvent mouseEvent ){
        try {
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
            Connection con=DriverManager.getConnection(url,"proj","123456");
            Statement stm=con.createStatement();
            String sss;
            String id= pidtxt.getText();
            String name= platetxt.getText();
            //checking the boxess
            String lp;
            String pptl;
            String pppc;
            String gd;
            String daa;
            String pm;
            String i;



            if(pnoc.isSelected())
                lp="available";
            else lp = "N/A";

            if(psc.isSelected())
                pptl="availabe";
            else pptl="N/A";

            if(pds.isSelected())
                pppc="availabe";
            else pppc="N/A";

            if(pl.isSelected())
                gd="availabe";
            else gd="N/A";

            if(pta.isSelected())
                daa="availabe";
            else daa="N/A";

            if(pti.isSelected())
                pm="availabe";
            else pm="N/A";

            if(pi.isSelected())
                i="availabe";
            else i="N/A";

            sss = "insert into private_cars values (prc.nextval,"+id+",'"+name+"','"+lp+"','"+pptl+"','"+pppc+"','"+gd+"','"+daa+"','"+pm+"','"+i+"')";
            stm.executeUpdate(sss);
            con.commit();
            con.close();
            alertbox.display("Private Cars","added successfully");
            pidtxt.clear();
            platetxt.clear();
            pnoc.setSelected(false);
            psc.setSelected(false);
            pds.setSelected(false);
            pl.setSelected(false);
            pta.setSelected(false);
            pti.setSelected(false);
            pi.setSelected(false);


        } catch (Exception throwables) {
            alertbox.display("An error happened","Please make sure that the ownerssn is for an existing person \n and the plate number is unique");
        }

    }
    //adding govermental cars
    @FXML
    private TextField gridtxt;

    @FXML
    private TextField gplatetxt;

    @FXML
    private CheckBox gnoc;

    @FXML
    private CheckBox gsc;

    @FXML
    private CheckBox gds;

    @FXML
    private CheckBox gta;

    @FXML
    private CheckBox gl;

    @FXML
    private CheckBox gti;

    @FXML
    private CheckBox gi;

    @FXML
    private CheckBox ggta;



    public void clickedgcsave (MouseEvent mouseEvent ){
        try {
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
            Connection con=DriverManager.getConnection(url,"proj","123456");
            Statement stm=con.createStatement();
            String sss;
            String id= gridtxt.getText();
            String name= gplatetxt.getText();
            //checking the boxess
            String lp;
            String pptl;
            String pppc;
            String gd;
            String daa;
            String pm;
            String i;
            String gggg;


            if(gnoc.isSelected())
                lp="available";
            else lp = "N/A";

            if(gsc.isSelected())
                pptl="availabe";
            else pptl="N/A";

            if(ggta.isSelected())
                gggg="availabe";
            else gggg="N/A";

            if(gl.isSelected())
                gd="availabe";
            else gd="N/A";

            if(gta.isSelected())
                daa="availabe";
            else daa="N/A";

            if(gti.isSelected())
                pm="availabe";
            else pm="N/A";

            if(gi.isSelected())
                i="availabe";
            else i="N/A";

            if(gds.isSelected())
                pppc="availabe";
            else pppc="N/A";

            sss = "insert into governmental_cars  values (gr.nextval,"+id+",'"+name+"','"+lp+"','"+pptl+"','"+gggg+"','"+gd+"','"+daa+"','"+pm+"','"+i+"','"+pppc+"')";
            stm.executeUpdate(sss);
            con.commit();
            con.close();
            alertbox.display("Governmental Cars","added successfully");
            gridtxt.clear();
            gplatetxt.clear();
            gnoc.setSelected(false);
            gsc.setSelected(false);
            gds.setSelected(false);
            gl.setSelected(false);
            gta.setSelected(false);
            gti.setSelected(false);
            gi.setSelected(false);
            ggta.setSelected(false);


        } catch (Exception throwables) {
            alertbox.display("An error happened","Please make sure that the ownerssn is for an existing person \n and the plate number is unique");
        }

    }
    //adding public cars

    @FXML
    private TextField ctossntxt;

    @FXML
    private TextField cplatetxt;

    @FXML
    private CheckBox cnoc;

    @FXML
    private CheckBox csc;

    @FXML
    private CheckBox cds;

    @FXML
    private CheckBox cta;

    @FXML
    private CheckBox cl;

    @FXML
    private CheckBox cti;

    @FXML
    private CheckBox ci;

    @FXML
    private CheckBox ctca;

    @FXML
    private TextField cpremittxt;

    @FXML
    private CheckBox cdv;


    public void clickedpucsave (MouseEvent mouseEvent ){
        try {
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
            Connection con=DriverManager.getConnection(url,"proj","123456");
            Statement stm=con.createStatement();
            String sss;
            String id= ctossntxt.getText();
            String name= cplatetxt.getText();
            String premit= cpremittxt.getText();
            //checking the boxess
            String lp;
            String pptl;
            String pppc;
            String gd;
            String daa;
            String pm;
            String i;
            String gggg;
            String ddvv;


            if(cnoc.isSelected())
                lp="available";
            else lp = "N/A";

            if(csc.isSelected())
                pptl="availabe";
            else pptl="N/A";

            if(cds.isSelected())
                gggg="availabe";
            else gggg="N/A";

            if(cl.isSelected())
                gd="availabe";
            else gd="N/A";

            if(cta.isSelected())
                daa="availabe";
            else daa="N/A";

            if(cti.isSelected())
                pm="availabe";
            else pm="N/A";

            if(ci.isSelected())
                i="availabe";
            else i="N/A";

            if(ctca.isSelected())
                pppc="availabe";
            else pppc="N/A";

            if(cdv.isSelected())
                ddvv="availabe";
            else ddvv="N/A";

            sss = "insert into public_cars  values (puc.nextval,"+id+",'"+name+"','"+premit+"','"+lp+"','"+pptl+"','"+gggg+"','"+gd+"','"+daa+"','"+pm+"','"+i+"','"+pppc+"','"+ddvv+"')";
            stm.executeUpdate(sss);
            con.commit();
            con.close();
            alertbox.display("Public Cars","added successfully");
            ctossntxt.clear();
            cplatetxt.clear();
            cpremittxt.clear();
            cnoc.setSelected(false);
            csc.setSelected(false);
            cds.setSelected(false);
            cl.setSelected(false);
            cta.setSelected(false);
            cti.setSelected(false);
            ci.setSelected(false);
            cdv.setSelected(false);
            ctca.setSelected(false);


        } catch (Exception throwables) {
            alertbox.display("An error happened","Please make sure that the ownerssn is for an existing person \n and the plate  number and the premit number are unique");
        }

    }
}
