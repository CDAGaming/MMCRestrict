package net.moddedminecraft.mmcrestrict.Data;

public class ItemDataUtil {

    protected String itemid, itemname, banreason;
    protected Boolean ownershipbanned, usagebanned, breakingbanned, placingbanned, dropbanned, craftbanned, worldbanned;

    public ItemDataUtil(String itemid, String itemname, String banreason, Boolean usagebanned, Boolean breakingbanned, Boolean placingbanned, Boolean ownershipbanned, Boolean dropbanned, Boolean craftbanned, Boolean worldbanned) {
        this.itemid = itemid;
        this.itemname = itemname;
        this.banreason = banreason;
        this.ownershipbanned = ownershipbanned;
        this.usagebanned = usagebanned;
        this.breakingbanned = breakingbanned;
        this.placingbanned = placingbanned;
        this.dropbanned = dropbanned;
        this.craftbanned = craftbanned;
        this.worldbanned = worldbanned;
    }

    public String getItemname() {
        return itemname;
    }

    public void setItemname(String itemname) {
        this.itemname = itemname;
    }

    public String getItemid() {
        return itemid;
    }

    public String getBanreason() {
        return banreason;
    }

    public void setBanreason(String banreason) {
        this.banreason = banreason;
    }

    public Boolean getOwnershipbanned() {
        return ownershipbanned;
    }

    public void setOwnershipbanned(Boolean ownershipbanned) {
        this.ownershipbanned = ownershipbanned;
    }

    public Boolean getUsagebanned() {
        return usagebanned;
    }

    public void setUsagebanned(Boolean usagebanned) {
        this.usagebanned = usagebanned;
    }

    public Boolean getBreakingbanned() {
        return breakingbanned;
    }

    public void setBreakingbanned(Boolean breakingbanned) {
        this.breakingbanned = breakingbanned;
    }

    public Boolean getPlacingbanned() {
        return placingbanned;
    }

    public void setPlacingbanned(Boolean placingbanned) {
        this.placingbanned = placingbanned;
    }

    public Boolean getDropbanned() {
        return dropbanned;
    }

    public void setDropbanned(Boolean dropbanned) {
        this.dropbanned = dropbanned;
    }

    public Boolean getWorldbanned() {
        return worldbanned;
    }

    public void setWorldbanned(Boolean worldbanned) {
        this.worldbanned = worldbanned;
    }

    public Boolean getCraftbanned() {
        return craftbanned;
    }

    public void setCraftbanned(Boolean craftbanned) {
        this.craftbanned = craftbanned;
    }
}
