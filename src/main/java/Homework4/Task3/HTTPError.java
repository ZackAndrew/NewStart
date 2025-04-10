package Homework4.Task3;

public enum HTTPError {
    BAD_REQUEST(400),
    UNAUTHORIZED(401),
    PAYMENT_REQUIRED(402),
    FORBIDDEN(403),
    NOT_FOUND(404);

    private final int errorCode;

    HTTPError(int errorCode) {
        this.errorCode = errorCode;
    }

    public static HTTPError getError(int errorCode) {
        return switch (errorCode) {
            case 400 -> BAD_REQUEST;
            case 401 -> UNAUTHORIZED;
            case 402 -> PAYMENT_REQUIRED;
            case 403 -> FORBIDDEN;
            case 404 -> NOT_FOUND;
            default -> null;
        };
    }

    public int getErrorCode() {
        return errorCode;
    }


    @Override
    public String toString() {
        return name() + '(' + errorCode + ')';
    }
}
