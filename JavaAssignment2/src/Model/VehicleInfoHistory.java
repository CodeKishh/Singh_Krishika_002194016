/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Krish
 */
public class VehicleInfoHistory {

    private ArrayList<VehicleInfo> history;
    private ArrayList<VehicleInfo> tmpList;
    private Date UpDT;

    public Date getUpDT() {
        return UpDT;
    }

    public void setUpDT(Date UpDT) {
        this.UpDT = UpDT;
    }

    public VehicleInfoHistory() {

        this.history = new ArrayList<VehicleInfo>();
        this.tmpList = new ArrayList<VehicleInfo>();

    }

    public ArrayList<VehicleInfo> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<VehicleInfo> history) {
        this.history = history;
    }

    public ArrayList<VehicleInfo> getTmpList() {
        return tmpList;
    }

    public void setTmpList(ArrayList<VehicleInfo> tmpList) {
        this.tmpList = tmpList;
    }

    public VehicleInfo addNewInfo() {

        VehicleInfo vinfo = new VehicleInfo();
        history.add(vinfo);

        return vinfo;
    }

    public void Update(int tableIndex, VehicleInfo vehicle) {
        history.set(tableIndex, vehicle);
    }

    public void deleteVi(VehicleInfo vi) {

        history.remove(vi);
    }

    public int size() {
        return history.size();
    }

    public VehicleInfo get(int i) {
        return history.get(i);
    }

    public int CntAvailCar() {

        int count = 0;

        for (VehicleInfo vi : history) {
            if (vi.isAvailability()) {
                count++;
            }

        }
        return count;

    }

    public int CntUnavailabe() {
        int cnt2 = 0;
        for (VehicleInfo vi : history) {
            if (!vi.isAvailability()) {
                cnt2++;
            }
        }
        return cnt2;

    }
}
