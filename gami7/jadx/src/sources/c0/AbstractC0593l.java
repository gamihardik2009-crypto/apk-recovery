package c0;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.util.DisplayMetrics;
import d0.AbstractC0632c;
import d0.C0633d;

/* renamed from: c0.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0593l {
    public static final AbstractC0632c a(Bitmap bitmap) {
        AbstractC0632c b3;
        ColorSpace colorSpace = bitmap.getColorSpace();
        if (colorSpace != null && (b3 = AbstractC0606y.b(colorSpace)) != null) {
            return b3;
        }
        float[] fArr = C0633d.f7399a;
        return C0633d.f7401c;
    }

    public static final Bitmap b(int i2, int i3, int i4, boolean z3, AbstractC0632c abstractC0632c) {
        return Bitmap.createBitmap((DisplayMetrics) null, i2, i3, AbstractC0571K.B(i4), z3, AbstractC0606y.a(abstractC0632c));
    }
}
