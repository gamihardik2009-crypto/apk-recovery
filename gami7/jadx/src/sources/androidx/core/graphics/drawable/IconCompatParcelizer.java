package androidx.core.graphics.drawable;

import A1.b;
import A1.c;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import java.nio.charset.Charset;
import s.AbstractC1166e;

/* loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(b bVar) {
        IconCompat iconCompat = new IconCompat();
        int i2 = iconCompat.f6798a;
        if (bVar.e(1)) {
            i2 = ((c) bVar).f132e.readInt();
        }
        iconCompat.f6798a = i2;
        byte[] bArr = iconCompat.f6800c;
        if (bVar.e(2)) {
            Parcel parcel = ((c) bVar).f132e;
            int readInt = parcel.readInt();
            if (readInt < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[readInt];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.f6800c = bArr;
        iconCompat.f6801d = bVar.f(iconCompat.f6801d, 3);
        int i3 = iconCompat.f6802e;
        if (bVar.e(4)) {
            i3 = ((c) bVar).f132e.readInt();
        }
        iconCompat.f6802e = i3;
        int i4 = iconCompat.f6803f;
        if (bVar.e(5)) {
            i4 = ((c) bVar).f132e.readInt();
        }
        iconCompat.f6803f = i4;
        iconCompat.f6804g = (ColorStateList) bVar.f(iconCompat.f6804g, 6);
        String str = iconCompat.f6806i;
        if (bVar.e(7)) {
            str = ((c) bVar).f132e.readString();
        }
        iconCompat.f6806i = str;
        String str2 = iconCompat.f6807j;
        if (bVar.e(8)) {
            str2 = ((c) bVar).f132e.readString();
        }
        iconCompat.f6807j = str2;
        iconCompat.f6805h = PorterDuff.Mode.valueOf(iconCompat.f6806i);
        switch (iconCompat.f6798a) {
            case -1:
                Parcelable parcelable = iconCompat.f6801d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                iconCompat.f6799b = parcelable;
                return iconCompat;
            case 0:
            default:
                return iconCompat;
            case 1:
            case AbstractC1166e.f10138f /* 5 */:
                Parcelable parcelable2 = iconCompat.f6801d;
                if (parcelable2 != null) {
                    iconCompat.f6799b = parcelable2;
                } else {
                    byte[] bArr3 = iconCompat.f6800c;
                    iconCompat.f6799b = bArr3;
                    iconCompat.f6798a = 3;
                    iconCompat.f6802e = 0;
                    iconCompat.f6803f = bArr3.length;
                }
                return iconCompat;
            case 2:
            case 4:
            case AbstractC1166e.f10136d /* 6 */:
                String str3 = new String(iconCompat.f6800c, Charset.forName("UTF-16"));
                iconCompat.f6799b = str3;
                if (iconCompat.f6798a == 2 && iconCompat.f6807j == null) {
                    iconCompat.f6807j = str3.split(":", -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.f6799b = iconCompat.f6800c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, b bVar) {
        bVar.getClass();
        iconCompat.f6806i = iconCompat.f6805h.name();
        switch (iconCompat.f6798a) {
            case -1:
                iconCompat.f6801d = (Parcelable) iconCompat.f6799b;
                break;
            case 1:
            case AbstractC1166e.f10138f /* 5 */:
                iconCompat.f6801d = (Parcelable) iconCompat.f6799b;
                break;
            case 2:
                iconCompat.f6800c = ((String) iconCompat.f6799b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f6800c = (byte[]) iconCompat.f6799b;
                break;
            case 4:
            case AbstractC1166e.f10136d /* 6 */:
                iconCompat.f6800c = iconCompat.f6799b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i2 = iconCompat.f6798a;
        if (-1 != i2) {
            bVar.h(1);
            ((c) bVar).f132e.writeInt(i2);
        }
        byte[] bArr = iconCompat.f6800c;
        if (bArr != null) {
            bVar.h(2);
            int length = bArr.length;
            Parcel parcel = ((c) bVar).f132e;
            parcel.writeInt(length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.f6801d;
        if (parcelable != null) {
            bVar.h(3);
            ((c) bVar).f132e.writeParcelable(parcelable, 0);
        }
        int i3 = iconCompat.f6802e;
        if (i3 != 0) {
            bVar.h(4);
            ((c) bVar).f132e.writeInt(i3);
        }
        int i4 = iconCompat.f6803f;
        if (i4 != 0) {
            bVar.h(5);
            ((c) bVar).f132e.writeInt(i4);
        }
        ColorStateList colorStateList = iconCompat.f6804g;
        if (colorStateList != null) {
            bVar.h(6);
            ((c) bVar).f132e.writeParcelable(colorStateList, 0);
        }
        String str = iconCompat.f6806i;
        if (str != null) {
            bVar.h(7);
            ((c) bVar).f132e.writeString(str);
        }
        String str2 = iconCompat.f6807j;
        if (str2 != null) {
            bVar.h(8);
            ((c) bVar).f132e.writeString(str2);
        }
    }
}
