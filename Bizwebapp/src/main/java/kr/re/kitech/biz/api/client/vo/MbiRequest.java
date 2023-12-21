/**
 * 
 */
package kr.re.kitech.biz.api.client.vo;
import java.util.List;

import kr.re.kitech.biz.api.client.enums.MobChnlType;

/**
 * 
 * @author James
 * @since 2022. 5. 16.
 */
public class MbiRequest {
	private final MobChnlType channelType;
	private String title;
	private String content;
	private List<String> chnlUserIds;
	private String reg;

	
	private MbiRequest(Builder builder){	
        this.channelType = builder.channelType;
        this.title = builder.title;
        this.content = builder.content;
        this.chnlUserIds = builder.chnlUserIds;
        this.reg = builder.reg;
	}

	@Override
	public String toString() {
		return "MbiRequest [channelType=" + channelType + ", title=" + title + ", content=" + content + ", chnlUserIds=" + chnlUserIds + ", reg=" + reg + "]";
	}
	
	public MobChnlType getChannelType() {
		return channelType;
	}

	public String getTitle() {
		return title;
	}

	public String getContent() {
		return content;
	}

	public List<String> getChnlUserIds() {
		return chnlUserIds;
	}
	
	public String getChnlUserIdToString() {
		return String.join(",", this.getChnlUserIds());	
	}

	public String getReg() {
		return reg;
	}
	
	public static class Builder {
		private final MobChnlType channelType;
		private String title;
		private String content;
		private List<String> chnlUserIds;
		private String reg;

	    
        public Builder(MobChnlType channelType) {
        	this.channelType = channelType;
        }
        public Builder title(String title) {
			this.title = title;
            return this;
        }        
        public Builder content(String content) {
			this.content = content;
            return this;
        }
        public Builder chnlUserIds(List<String> chnlUserIds) {
			this.chnlUserIds = chnlUserIds;
            return this;
        }
        public Builder reg(String reg) {
			this.reg = reg;
            return this;
        }
        public MbiRequest build() {
            return new MbiRequest(this);
        }        
	}
}
