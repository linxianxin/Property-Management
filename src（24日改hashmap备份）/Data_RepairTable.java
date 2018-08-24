import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Data_RepairTable {
    /*维修信息    RNo编号    RSubDate提交日期    RTitle标题    RText正文    RState状态    RReply回复    RSolveDate解决日期    ONo业主编号*/
    private SimpleStringProperty RNo,RSubDate,RTitle,RText,RState,RReply,RSolveDate;
    private SimpleStringProperty ONo,OName,OSex,OTel,OID,ONote;
    public Data_RepairTable(String RNo,String RSubDate,String RTitle,String RText,String RState,String RReply,String RSolveDate,String ONo,String OName,String OSex,String OTel,String OID,String ONote){
        this.RNo = new SimpleStringProperty(RNo);
        this.RSubDate = new SimpleStringProperty(RSubDate);
        this.RTitle = new SimpleStringProperty(RTitle);
        this.RText = new SimpleStringProperty(RText);
        this.RState = new SimpleStringProperty(RState);
        this.RReply = new SimpleStringProperty(RReply);
        this.RSolveDate = new SimpleStringProperty(RSolveDate);
        this.ONo = new SimpleStringProperty(ONo);
        this.OName = new SimpleStringProperty(OName);
        this.OSex = new SimpleStringProperty(OSex);
        this.OTel = new SimpleStringProperty(OTel);
        this.OID = new SimpleStringProperty(OID);
        this.ONote = new SimpleStringProperty(ONote);
    }
    public StringProperty getRNo(){
        return RNo;
    }
    public StringProperty getRSubDate(){
        return RSubDate;
    }
    public StringProperty getRTitle(){
        return RTitle;
    }
    public StringProperty getRText(){
        return RText;
    }
    public StringProperty getRState(){
        return RState;
    }
    public StringProperty getRReply(){
        return RReply;
    }
    public StringProperty getRSolveDate(){
        return RSolveDate;
    }
    public StringProperty getONo(){
        return ONo;
    }
    public StringProperty getOName(){
        return OName;
    }
    public StringProperty getOSex(){
        return OSex;
    }
    public StringProperty getOTel(){
        return OTel;
    }
    public StringProperty getOID(){
        return OID;
    }
    public StringProperty getONote(){
        return ONote;
    }
    public void setRNo(String RNo){
        this.RNo.set(RNo);
    }
    public void setRSubDate(String RSubDate){
        this.RSubDate.set(RSubDate);
    }
    public void setRTitle(String RTitle){
        this.RTitle.set(RTitle);
    }
    public void setRText(String RText){
        this.RText.set(RText);
    }
    public void setRState(String RState){
        this.RState.set(RState);
    }
    public void setRReply(String RReply){
        this.RReply.set(RReply);
    }
    public void setRSolveDate(String RSolveDate){
        this.RSolveDate.set(RSolveDate);
    }
    public void setONo(String ONo){
        this.ONo.set(ONo);
    }
    public void setOName(String OName){
        this.OName.set(OName);
    }
    public void setOSex(String OSex){
        this.OSex.set(OSex);
    }
    public void setOTel(String OTel){
        this.OTel.set(OTel);
    }
    public void setOID(String OID){
        this.OID.set(OID);
    }
    public void setONote(String ONote){
        this.ONote.set(ONote);
    }
}