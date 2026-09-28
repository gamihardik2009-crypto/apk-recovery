package androidx.core.graphics.drawable;

import X0.a;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.os.Build;
import android.os.Parcelable;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.lang.reflect.InvocationTargetException;
import s.AbstractC1166e;

/* loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: k, reason: collision with root package name */
    public static final PorterDuff.Mode f6797k = PorterDuff.Mode.SRC_IN;

    /* renamed from: b, reason: collision with root package name */
    public Object f6799b;

    /* renamed from: j, reason: collision with root package name */
    public String f6807j;

    /* renamed from: a, reason: collision with root package name */
    public int f6798a = -1;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f6800c = null;

    /* renamed from: d, reason: collision with root package name */
    public Parcelable f6801d = null;

    /* renamed from: e, reason: collision with root package name */
    public int f6802e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f6803f = 0;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f6804g = null;

    /* renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f6805h = f6797k;

    /* renamed from: i, reason: collision with root package name */
    public String f6806i = null;

    public final String toString() {
        String str;
        int i2;
        if (this.f6798a == -1) {
            return String.valueOf(this.f6799b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        switch (this.f6798a) {
            case 1:
                str = "BITMAP";
                break;
            case 2:
                str = "RESOURCE";
                break;
            case 3:
                str = "DATA";
                break;
            case 4:
                str = "URI";
                break;
            case AbstractC1166e.f10138f /* 5 */:
                str = "BITMAP_MASKABLE";
                break;
            case AbstractC1166e.f10136d /* 6 */:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb.append(str);
        switch (this.f6798a) {
            case 1:
            case AbstractC1166e.f10138f /* 5 */:
                sb.append(" size=");
                sb.append(((Bitmap) this.f6799b).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.f6799b).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.f6807j);
                sb.append(" id=");
                int i3 = this.f6798a;
                if (i3 == -1) {
                    int i4 = Build.VERSION.SDK_INT;
                    Object obj = this.f6799b;
                    if (i4 >= 28) {
                        i2 = a.a(obj);
                    } else {
                        i2 = 0;
                        try {
                            i2 = ((Integer) obj.getClass().getMethod("getResId", null).invoke(obj, null)).intValue();
                        } catch (IllegalAccessException e3) {
                            Log.e("IconCompat", "Unable to get icon resource", e3);
                        } catch (NoSuchMethodException e4) {
                            Log.e("IconCompat", "Unable to get icon resource", e4);
                        } catch (InvocationTargetException e5) {
                            Log.e("IconCompat", "Unable to get icon resource", e5);
                        }
                    }
                } else {
                    if (i3 != 2) {
                        throw new IllegalStateException("called getResId() on " + this);
                    }
                    i2 = this.f6802e;
                }
                sb.append(String.format("0x%08x", Integer.valueOf(i2)));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f6802e);
                if (this.f6803f != 0) {
                    sb.append(" off=");
                    sb.append(this.f6803f);
                    break;
                }
                break;
            case 4:
            case AbstractC1166e.f10136d /* 6 */:
                sb.append(" uri=");
                sb.append(this.f6799b);
                break;
        }
        if (this.f6804g != null) {
            sb.append(" tint=");
            sb.append(this.f6804g);
        }
        if (this.f6805h != f6797k) {
            sb.append(" mode=");
            sb.append(this.f6805h);
        }
        sb.append(")");
        return sb.toString();
    }
}
