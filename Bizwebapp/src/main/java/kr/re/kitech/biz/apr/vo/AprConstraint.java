/**
 * 
 */
package kr.re.kitech.biz.apr.vo;

/**
 * 
 * @author James
 * @since 2023. 4. 18.
 */
public class AprConstraint {

	private final boolean exist;
	private String message;

	private AprConstraint(Builder builder){	
        this.exist = builder.exist;
        this.message = builder.message;
     
	}

	@Override
	public String toString() {
		return "AprConstaint [isExist=" + exist + ", massage=" + message + "]";
	}
	
    public boolean isExist() {
		return exist;
	}
	
    public String getMessage() {
		return message;
	}
	

	public static class Builder {
		private final boolean exist;
		private String message;

        public Builder(boolean exist) {
        	this.exist = exist;
        }
        public Builder message(String message) {
			this.message = message;
            return this;
        }

        public AprConstraint build() {
            return new AprConstraint(this);
        }        
	}
}