package atg.repository.beans.productcatalog;                                                                                                     
import java.util.*;                                                                                                                       
import java.util.Comparator;                                                                                                              
import atg.repository.*;                                                                                                                  
import java.sql.Timestamp;                                                                                                                
import atg.adapter.gsa.MutableRepositoryItemExt;                                                                                          

                                                                                                                       
                                                                                                                                          
@SuppressWarnings({ "serial", "unused" })                                                                                             
public class ConfigurableSku extends Sku implements java.io.Serializable {                                            
   static transient MutableRepository REPOSITORY;                                                                                         
   static transient String DESCRIPTOR = "configurableSku";                                                                          
   static transient String REPOSITORY_COMPONENT = "/atg/commerce/catalog/ProductCatalog";                                                                
   static final transient Set<String> COMPLEX_PROPERTIES;                                                                                 
                                                                                                                                          
   static {                                                                                                                               
     Set<String> s  = new HashSet<String>();                                                                                              
          s.add("parentProducts");
          s.add("thumbnailImage");
          s.add("derivedCatalogs");
          s.add("bundleLinks");
          s.add("smallImage");
          s.add("configurableProperties");
          s.add("template");
          s.add("largeImage");
          s.add("computedCatalogs");
          s.add("fixedReplacementProducts");
          s.add("catalogsReplacementProducts");
          s.add("replacementProducts");
          s.add("siteIds");
          s.add("catalogs");
                                                                                                                  
     COMPLEX_PROPERTIES = s;                                                                                                              
   }                                                                                                                                      
                                                                                                                                          
                                                                                                                                          
   public ConfigurableSku()  {                                                                                                           
   }                                                                                                                                      
                                                                                                                                          
   public ConfigurableSku(MutableRepositoryItem delegate) {                                                                              
      super(delegate);                                                                                                                    
   }                                                                                                                                      
                                                                                                                                          
   @Override                                                                                                                              
   protected Set<String> getComplexProperties() {                                                                                         
      return COMPLEX_PROPERTIES;                                                                                                          
   }                                                                                                                                      
                                                                                                                                          
   @Override                                                                                                                              
   protected String getDescriptor() {                                                                                                     
      return DESCRIPTOR;                                                                                                                  
   }                                                                                                                                      
                                                                                                                                          
   @Override                                                                                                                              
   protected String getRepositoryComponent() {                                                                                            
      return REPOSITORY_COMPONENT;                                                                                                        
   }                                                                                                                                      
                                                                                                                                          
   public Timestamp getStartDateThis(){
      return getSimpleProperty("startDate",Timestamp.class);
   }

   public void setStartDateThis(Timestamp pStartDate){
      setSimpleProperty("startDate", pStartDate);
   }


   public Set<Product> getParentProductsThis(){
      return getSetProperty("parentProducts", Product.class);
   }

   public void setParentProductsThis(Set<Product> pParentProducts){
       setSetProperty("parentProducts", pParentProducts);
   } 


   public Boolean getOnlineOnlyThis(){
      return getSimpleProperty("onlineOnly",Boolean.class);
   }

   public void setOnlineOnlyThis(Boolean pOnlineOnly){
      setSimpleProperty("onlineOnly", pOnlineOnly);
   }


   public Timestamp getEndDateThis(){
      return getSimpleProperty("endDate",Timestamp.class);
   }

   public void setEndDateThis(Timestamp pEndDate){
      setSimpleProperty("endDate", pEndDate);
   }


   public String getTypeThis(){
      return getSimpleProperty("type",String.class);
   }

   public void setTypeThis(String pType){
      setSimpleProperty("type", pType);
   }


   public String getManufacturerPartNumberThis(){
      return getSimpleProperty("manufacturer_part_number",String.class);
   }

   public void setManufacturerPartNumberThis(String pManufacturerPartNumber){
      setSimpleProperty("manufacturerPartNumber", pManufacturerPartNumber);
   }


   public ConfigurableSku getThumbnailImageThis(){
      return getSingleRepositoryProperty("thumbnailImage",ConfigurableSku.class);
   }

   public void setThumbnailImageThis(ConfigurableSku pThumbnailImage){
      setSingleRepositoryProperty("thumbnailImage", pThumbnailImage);
   }


   public Integer getVersionThis(){
      return getSimpleProperty("version",Integer.class);
   }

   public void setVersionThis(Integer pVersion){
      setSimpleProperty("version", pVersion);
   }


   public String getIdThis(){
      return getSimpleProperty("id",String.class);
   }

   public void setIdThis(String pId){
      setSimpleProperty("id", pId);
   }


   public Set<Catalog> getDerivedCatalogsThis(){
      return getSetProperty("derivedCatalogs", Catalog.class);
   }

   public void setDerivedCatalogsThis(Set<Catalog> pDerivedCatalogs){
       setSetProperty("derivedCatalogs", pDerivedCatalogs);
   } 


   public String getUnitOfMeasureThis(){
      return getSimpleProperty("unit_of_measure",String.class);
   }

   public void setUnitOfMeasureThis(String pUnitOfMeasure){
      setSimpleProperty("unitOfMeasure", pUnitOfMeasure);
   }


   public List<SkuLink> getBundleLinksThis(){
      return getListProperty("bundleLinks", SkuLink.class);
   }

   public void setBundleLinksThis(List<SkuLink> pBundleLinks){
       setListProperty("bundleLinks", pBundleLinks);
   } 


   public Double getListPriceThis(){
      return getSimpleProperty("listPrice",Double.class);
   }

   public void setListPriceThis(Double pListPrice){
      setSimpleProperty("listPrice", pListPrice);
   }


   public String getDescriptionThis(){
      return getSimpleProperty("description",String.class);
   }

   public void setDescriptionThis(String pDescription){
      setSimpleProperty("description", pDescription);
   }


   public Double getMarginThis(){
      return getSimpleProperty("margin",Double.class);
   }

   public void setMarginThis(Double pMargin){
      setSimpleProperty("margin", pMargin);
   }


   public Double getQuantityThis(){
      return getSimpleProperty("quantity",Double.class);
   }

   public void setQuantityThis(Double pQuantity){
      setSimpleProperty("quantity", pQuantity);
   }


   public ConfigurableSku getSmallImageThis(){
      return getSingleRepositoryProperty("smallImage",ConfigurableSku.class);
   }

   public void setSmallImageThis(ConfigurableSku pSmallImage){
      setSingleRepositoryProperty("smallImage", pSmallImage);
   }


   public List<ConfigurableProperty> getConfigurableProperties(){
      return getListProperty("configurableProperties", ConfigurableProperty.class);
   }

   public void setConfigurableProperties(List<ConfigurableProperty> pConfigurableProperties){
       setListProperty("configurableProperties", pConfigurableProperties);
   } 


   public ConfigurableSku getTemplateThis(){
      return getSingleRepositoryProperty("template",ConfigurableSku.class);
   }

   public void setTemplateThis(ConfigurableSku pTemplate){
      setSingleRepositoryProperty("template", pTemplate);
   }


   public Boolean getOnSaleThis(){
      return getSimpleProperty("onSale",Boolean.class);
   }

   public void setOnSaleThis(Boolean pOnSale){
      setSimpleProperty("onSale", pOnSale);
   }


   public String getDisplayNameDefaultThis(){
      return getSimpleProperty("displayNameDefault",String.class);
   }

   public void setDisplayNameDefaultThis(String pDisplayNameDefault){
      setSimpleProperty("displayNameDefault", pDisplayNameDefault);
   }


   public String getFulfillerThis(){
      return getSimpleProperty("fulfiller",String.class);
   }

   public void setFulfillerThis(String pFulfiller){
      setSimpleProperty("fulfiller", pFulfiller);
   }


   public Double getWholesalePriceThis(){
      return getSimpleProperty("wholesalePrice",Double.class);
   }

   public void setWholesalePriceThis(Double pWholesalePrice){
      setSimpleProperty("wholesalePrice", pWholesalePrice);
   }


   public String getTaxStatusThis(){
      return getSimpleProperty("taxStatus",String.class);
   }

   public void setTaxStatusThis(String pTaxStatus){
      setSimpleProperty("taxStatus", pTaxStatus);
   }


   public ConfigurableSku getLargeImageThis(){
      return getSingleRepositoryProperty("largeImage",ConfigurableSku.class);
   }

   public void setLargeImageThis(ConfigurableSku pLargeImage){
      setSingleRepositoryProperty("largeImage", pLargeImage);
   }


   public Set<Catalog> getComputedCatalogsThis(){
      return getSetProperty("computedCatalogs", Catalog.class);
   }

   public void setComputedCatalogsThis(Set<Catalog> pComputedCatalogs){
       setSetProperty("computedCatalogs", pComputedCatalogs);
   } 


   public List<Product> getFixedReplacementProductsThis(){
      return getListProperty("fixedReplacementProducts", Product.class);
   }

   public void setFixedReplacementProductsThis(List<Product> pFixedReplacementProducts){
       setListProperty("fixedReplacementProducts", pFixedReplacementProducts);
   } 


   public List<Product> getCatalogsReplacementProductsThis(){
      return getListProperty("catalogsReplacementProducts", Product.class);
   }

   public void setCatalogsReplacementProductsThis(List<Product> pCatalogsReplacementProducts){
       setListProperty("catalogsReplacementProducts", pCatalogsReplacementProducts);
   } 


   public String getItemAclThis(){
      return getSimpleProperty("itemAcl",String.class);
   }

   public void setItemAclThis(String pItemAcl){
      setSimpleProperty("itemAcl", pItemAcl);
   }


   public Boolean getDiscountableThis(){
      return getSimpleProperty("discountable",Boolean.class);
   }

   public void setDiscountableThis(Boolean pDiscountable){
      setSimpleProperty("discountable", pDiscountable);
   }


   public Timestamp getCreationDateThis(){
      return getSimpleProperty("creationDate",Timestamp.class);
   }

   public void setCreationDateThis(Timestamp pCreationDate){
      setSimpleProperty("creationDate", pCreationDate);
   }


   public Boolean getNonreturnableThis(){
      return getSimpleProperty("nonreturnable",Boolean.class);
   }

   public void setNonreturnableThis(Boolean pNonreturnable){
      setSimpleProperty("nonreturnable", pNonreturnable);
   }


   public List<Product> getReplacementProductsThis(){
      return getListProperty("replacementProducts", Product.class);
   }

   public void setReplacementProductsThis(List<Product> pReplacementProducts){
       setListProperty("replacementProducts", pReplacementProducts);
   } 


   public Set<java.lang.String> getSiteIdsThis(){
      return getSimpleProperty("siteIds",String.class);
   }

   public void setSiteIdsThis(Set<java.lang.String> pSiteIds){
      setSimpleProperty("siteIds", pSiteIds);
   }


   public Boolean getGiftWrapEligibleThis(){
      return getSimpleProperty("giftWrapEligible",Boolean.class);
   }

   public void setGiftWrapEligibleThis(Boolean pGiftWrapEligible){
      setSimpleProperty("giftWrapEligible", pGiftWrapEligible);
   }


   public Set<Catalog> getCatalogsThis(){
      return getSetProperty("catalogs", Catalog.class);
   }

   public void setCatalogsThis(Set<Catalog> pCatalogs){
       setSetProperty("catalogs", pCatalogs);
   } 


   public String getDescriptionDefaultThis(){
      return getSimpleProperty("descriptionDefault",String.class);
   }

   public void setDescriptionDefaultThis(String pDescriptionDefault){
      setSimpleProperty("descriptionDefault", pDescriptionDefault);
   }


   public Double getSalePriceThis(){
      return getSimpleProperty("salePrice",Double.class);
   }

   public void setSalePriceThis(Double pSalePrice){
      setSimpleProperty("salePrice", pSalePrice);
   }


   public String getDisplayNameThis(){
      return getSimpleProperty("displayName",String.class);
   }

   public void setDisplayNameThis(String pDisplayName){
      setSimpleProperty("displayName", pDisplayName);
   }


                                                                                                                        
}                                                                                                                                         
