/**
 * 
 */
package kr.re.kitech.biz.api.client.vo;

import kr.re.kitech.biz.api.client.enums.SearchIndex;

/**
 * 
 * @author James
 * @since 2023. 3. 29.
 */
public class ScRequest {

	private final SearchIndex searchIndex;
	private String query;
	
	private ScRequest(Builder builder){	
        this.searchIndex = builder.searchIndex;
        this.query = builder.query;
	}

	@Override
	public String toString() {
		return "ScRequest [ searchIndex=" + searchIndex + ", query=" + query + "]";
	}
	
    public SearchIndex getSearchIndex() {
		return searchIndex;
	}
	
    public String getIndex() {
		return searchIndex.getCode();
	}
	
    public String getQuery() {
		return query;
	}
	
	public static class Builder {
		private final SearchIndex searchIndex;
		private String query;
	    
        public Builder(SearchIndex searchIndex) {
        	this.searchIndex = searchIndex;
        }

        public Builder query(String query) {
			this.query = query;
            return this;
        }

        public ScRequest build() {
            return new ScRequest(this);
        }        
	}
}
