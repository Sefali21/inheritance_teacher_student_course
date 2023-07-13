package beziehungLehrerStudent;

public class KlassRoom extends Course{
    private int klassRoomId;
    private int klassRoomKapazite;

    public KlassRoom(String courseName, String courseId, String courseBranche, String courseDauert, int klassRoomId, int klassRoomKapazite) {
        super(courseName, courseId, courseBranche, courseDauert);
        this.klassRoomId = klassRoomId;
        this.klassRoomKapazite = klassRoomKapazite;
    }

    public int getKlassRoomId() {
        return klassRoomId;
    }

    public void setKlassRoomId(int klassRoomId) {
        this.klassRoomId = klassRoomId;
    }

    public int getKlassRoomKapazite() {
        return klassRoomKapazite;
    }

    public void setKlassRoomKapazite(int klassRoomKapazite) {
        this.klassRoomKapazite = klassRoomKapazite;
    }

    @Override
    public String toString() {
        return "KlassRoom{" +
                "klassRoomId=" + klassRoomId +
                ", klassRoomKapazite=" + klassRoomKapazite +super.toString()+
                '}';
    }
}
