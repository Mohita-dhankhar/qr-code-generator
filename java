import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import com.g
        System.out.println("QR Code generated at: " + filePath);
    }

    public static void main(String[] args) {
        String data = "https://example.com"; // Text or URL you want to encode
        int width = 300;
        int height = 300;
        String filePath = "qrcode.png";

        try {
            generateQRCode(data, width, height, filePath);
        } catch (WriterException | IOException e) {
            e.printStackTrace();
        }
    }
}

