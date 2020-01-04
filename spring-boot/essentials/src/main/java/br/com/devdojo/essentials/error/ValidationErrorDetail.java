package br.com.devdojo.essentials.error;

public class ValidationErrorDetail extends ErrorDetail{
    private String field;
    private String fieldMessage;

    public static final class Builder {
        private String title;
        private Integer status;
        private String detail;
        private Long timestamp;
        private String developerMessage;
        private String field;
        private String fieldMessage;
    
        private Builder() {
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public Builder title(String title) {
            this.title = title;
            return this;
        }

        public Builder status(Integer status) {
            this.status = status;
            return this;
        }

        public Builder detail(String detail) {
            this.detail = detail;
            return this;
        }

        public Builder timestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        public Builder developerMessage(String message) {
            this.developerMessage = message;
            return this;
        }
        public Builder field(String field){
            this.field = field;
            return this;
        }
        public Builder messageField(String messageField){
            this.fieldMessage = messageField;
            return this;
        }

        public ValidationErrorDetail build() {
            ValidationErrorDetail validationErrorDetail = new ValidationErrorDetail();
            validationErrorDetail.setDeveloperMessage(developerMessage);
            validationErrorDetail.setTitle(title);
            validationErrorDetail.setDetail(detail);
            validationErrorDetail.setTimestamp(timestamp);
            validationErrorDetail.setStatus(status);
            validationErrorDetail.field= field;
            validationErrorDetail.fieldMessage =fieldMessage; 
            return validationErrorDetail;
        }

    }
    
    public String getField(){
        return field;
    }
    public String getFieldMessage(){
        return fieldMessage;
    }

    public void setField(String field) {
        this.field = field;
    }

    public void setFieldMessage(String fieldMessage) {
        this.fieldMessage = fieldMessage;
    }
}