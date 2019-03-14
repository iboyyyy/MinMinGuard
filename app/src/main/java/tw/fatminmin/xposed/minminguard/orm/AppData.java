package tw.fatminmin.xposed.minminguard.orm;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 

/**
 * Entity mapped to table "APP_DATA".
 */
public class AppData
{

    private String pkgName;
    private String adNetworks;
    private Integer blockNum;

    public AppData()
    {
    }

    public AppData(String pkgName)
    {
        this.pkgName = pkgName;
    }

    public AppData(String pkgName, String adNetworks, Integer blockNum)
    {
        this.pkgName = pkgName;
        this.adNetworks = adNetworks;
        this.blockNum = blockNum;
    }

    public String getPkgName()
    {
        return pkgName;
    }

    public void setPkgName(String pkgName)
    {
        this.pkgName = pkgName;
    }

    public String getAdNetworks()
    {
        return adNetworks;
    }

    public void setAdNetworks(String adNetworks)
    {
        this.adNetworks = adNetworks;
    }

    public Integer getBlockNum()
    {
        return blockNum;
    }

    public void setBlockNum(Integer blockNum)
    {
        this.blockNum = blockNum;
    }
}
