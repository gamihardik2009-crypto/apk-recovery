package c0;

import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import d0.AbstractC0631b;
import d0.AbstractC0632c;
import d0.C0633d;
import d0.C0641l;
import d0.C0642m;
import d0.C0646q;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: c0.K, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0571K {

    /* renamed from: a, reason: collision with root package name */
    public static final C1.b f7193a = new C1.b(19, false);

    /* renamed from: b, reason: collision with root package name */
    public static Method f7194b;

    /* renamed from: c, reason: collision with root package name */
    public static Method f7195c;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f7196d;

    public static final int A(long j3) {
        float[] fArr = C0633d.f7399a;
        return (int) (C0603v.a(j3, C0633d.f7401c) >>> 32);
    }

    public static final Bitmap.Config B(int i2) {
        return C0563C.a(i2, 0) ? Bitmap.Config.ARGB_8888 : C0563C.a(i2, 1) ? Bitmap.Config.ALPHA_8 : C0563C.a(i2, 2) ? Bitmap.Config.RGB_565 : C0563C.a(i2, 3) ? Bitmap.Config.RGBA_F16 : C0563C.a(i2, 4) ? Bitmap.Config.HARDWARE : Bitmap.Config.ARGB_8888;
    }

    public static final b0.d C(RectF rectF) {
        return new b0.d(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public static final PorterDuff.Mode D(int i2) {
        return m(i2, 0) ? PorterDuff.Mode.CLEAR : m(i2, 1) ? PorterDuff.Mode.SRC : m(i2, 2) ? PorterDuff.Mode.DST : m(i2, 3) ? PorterDuff.Mode.SRC_OVER : m(i2, 4) ? PorterDuff.Mode.DST_OVER : m(i2, 5) ? PorterDuff.Mode.SRC_IN : m(i2, 6) ? PorterDuff.Mode.DST_IN : m(i2, 7) ? PorterDuff.Mode.SRC_OUT : m(i2, 8) ? PorterDuff.Mode.DST_OUT : m(i2, 9) ? PorterDuff.Mode.SRC_ATOP : m(i2, 10) ? PorterDuff.Mode.DST_ATOP : m(i2, 11) ? PorterDuff.Mode.XOR : m(i2, 12) ? PorterDuff.Mode.ADD : m(i2, 14) ? PorterDuff.Mode.SCREEN : m(i2, 15) ? PorterDuff.Mode.OVERLAY : m(i2, 16) ? PorterDuff.Mode.DARKEN : m(i2, 17) ? PorterDuff.Mode.LIGHTEN : m(i2, 13) ? PorterDuff.Mode.MULTIPLY : PorterDuff.Mode.SRC_OVER;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x001c, code lost:
    
        if (r3 <= 1.0000008f) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000b, code lost:
    
        if (r3 >= (-8.34465E-7f)) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x000d, code lost:
    
        r3 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x000f, code lost:
    
        r3 = Float.NaN;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int E(float r3, float[] r4, int r5) {
        /*
            r0 = 0
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            r2 = 2143289344(0x7fc00000, float:NaN)
            if (r1 >= 0) goto L11
            r1 = -1251999744(0xffffffffb5600000, float:-8.34465E-7)
            int r3 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r3 < 0) goto Lf
        Ld:
            r3 = r0
            goto L1f
        Lf:
            r3 = r2
            goto L1f
        L11:
            r0 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 <= 0) goto L1f
            r1 = 1065353223(0x3f800007, float:1.0000008)
            int r3 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r3 > 0) goto Lf
            goto Ld
        L1f:
            r4[r5] = r3
            boolean r3 = java.lang.Float.isNaN(r3)
            r3 = r3 ^ 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: c0.AbstractC0571K.E(float, float[], int):int");
    }

    public static final C0584c a(C0588g c0588g) {
        Canvas canvas = AbstractC0585d.f7248a;
        C0584c c0584c = new C0584c();
        c0584c.f7245a = new Canvas(c0588g.f7253a);
        return c0584c;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0107  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long b(float r20, float r21, float r22, float r23, d0.AbstractC0632c r24) {
        /*
            Method dump skipped, instructions count: 476
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c0.AbstractC0571K.b(float, float, float, float, d0.c):long");
    }

    public static final long c(int i2) {
        long j3 = i2 << 32;
        int i3 = C0603v.f7278h;
        return j3;
    }

    public static final long d(long j3) {
        long j4 = j3 << 32;
        int i2 = C0603v.f7278h;
        return j4;
    }

    public static long e(int i2, int i3, int i4) {
        return c(((i2 & 255) << 16) | (-16777216) | ((i3 & 255) << 8) | (i4 & 255));
    }

    public static C0588g f(int i2, int i3, int i4) {
        C0646q c0646q = C0633d.f7401c;
        B(i4);
        return new C0588g(AbstractC0593l.b(i2, i3, i4, true, c0646q));
    }

    public static final C0589h g() {
        return new C0589h(new Paint(7));
    }

    public static final C0591j h() {
        return new C0591j(new Path());
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long i(float r18, float r19, float r20, float r21, d0.AbstractC0632c r22) {
        /*
            Method dump skipped, instructions count: 338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c0.AbstractC0571K.i(float, float, float, float, d0.c):long");
    }

    public static final float j(float[] fArr, int i2, float[] fArr2, int i3) {
        int i4 = i2 * 4;
        return (fArr[i4 + 3] * fArr2[12 + i3]) + (fArr[i4 + 2] * fArr2[8 + i3]) + (fArr[i4 + 1] * fArr2[4 + i3]) + (fArr[i4] * fArr2[i3]);
    }

    public static final long k(long j3, long j4) {
        float f3;
        float f4;
        long a3 = C0603v.a(j3, C0603v.f(j4));
        float d3 = C0603v.d(j4);
        float d4 = C0603v.d(a3);
        float f5 = 1.0f - d4;
        float f6 = (d3 * f5) + d4;
        float h2 = C0603v.h(a3);
        float h3 = C0603v.h(j4);
        float f7 = 0.0f;
        if (f6 == 0.0f) {
            f3 = 0.0f;
        } else {
            f3 = (((h3 * d3) * f5) + (h2 * d4)) / f6;
        }
        float g3 = C0603v.g(a3);
        float g4 = C0603v.g(j4);
        if (f6 == 0.0f) {
            f4 = 0.0f;
        } else {
            f4 = (((g4 * d3) * f5) + (g3 * d4)) / f6;
        }
        float e3 = C0603v.e(a3);
        float e4 = C0603v.e(j4);
        if (f6 != 0.0f) {
            f7 = (((e4 * d3) * f5) + (e3 * d4)) / f6;
        }
        return i(f3, f4, f7, f6, C0603v.f(j4));
    }

    public static void l(Canvas canvas, boolean z3) {
        Method method;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            C0602u.f7271a.a(canvas, z3);
            return;
        }
        if (!f7196d) {
            try {
                if (i2 == 28) {
                    Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass());
                    f7194b = (Method) declaredMethod.invoke(Canvas.class, "insertReorderBarrier", new Class[0]);
                    f7195c = (Method) declaredMethod.invoke(Canvas.class, "insertInorderBarrier", new Class[0]);
                } else {
                    f7194b = Canvas.class.getDeclaredMethod("insertReorderBarrier", null);
                    f7195c = Canvas.class.getDeclaredMethod("insertInorderBarrier", null);
                }
                Method method2 = f7194b;
                if (method2 != null) {
                    method2.setAccessible(true);
                }
                Method method3 = f7195c;
                if (method3 != null) {
                    method3.setAccessible(true);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
            f7196d = true;
        }
        if (z3) {
            try {
                Method method4 = f7194b;
                if (method4 != null) {
                    method4.invoke(canvas, null);
                }
            } catch (IllegalAccessException | InvocationTargetException unused2) {
                return;
            }
        }
        if (z3 || (method = f7195c) == null) {
            return;
        }
        method.invoke(canvas, null);
    }

    public static final boolean m(int i2, int i3) {
        return i2 == i3;
    }

    public static final boolean n(int i2, int i3) {
        return i2 == i3;
    }

    public static final boolean o(int i2, int i3) {
        return i2 == i3;
    }

    public static final boolean p(int i2, int i3) {
        return i2 == i3;
    }

    public static final boolean q(int i2, int i3) {
        return i2 == i3;
    }

    public static long r() {
        return C0603v.f7272b;
    }

    public static final long s(long j3, long j4, float f3) {
        C0641l c0641l = C0633d.f7417t;
        long a3 = C0603v.a(j3, c0641l);
        long a4 = C0603v.a(j4, c0641l);
        float d3 = C0603v.d(a3);
        float h2 = C0603v.h(a3);
        float g3 = C0603v.g(a3);
        float e3 = C0603v.e(a3);
        float d4 = C0603v.d(a4);
        float h3 = C0603v.h(a4);
        float g4 = C0603v.g(a4);
        float e4 = C0603v.e(a4);
        if (f3 < 0.0f) {
            f3 = 0.0f;
        }
        if (f3 > 1.0f) {
            f3 = 1.0f;
        }
        return C0603v.a(i(B2.a.y(h2, h3, f3), B2.a.y(g3, g4, f3), B2.a.y(e3, e4, f3), B2.a.y(d3, d4, f3), c0641l), C0603v.f(j4));
    }

    public static final float t(long j3) {
        AbstractC0632c f3 = C0603v.f(j3);
        if (!AbstractC0631b.a(f3.f7397b, AbstractC0631b.f7391a)) {
            throw new IllegalArgumentException("The specified color must be encoded in an RGB color space. The supplied color space is " + ((Object) AbstractC0631b.b(f3.f7397b)));
        }
        double h2 = C0603v.h(j3);
        C0642m c0642m = ((C0646q) f3).f7458p;
        double c3 = c0642m.c(h2);
        float c4 = (float) ((c0642m.c(C0603v.e(j3)) * 0.0722d) + (c0642m.c(C0603v.g(j3)) * 0.7152d) + (c3 * 0.2126d));
        if (c4 < 0.0f) {
            c4 = 0.0f;
        }
        if (c4 > 1.0f) {
            return 1.0f;
        }
        return c4;
    }

    public static final void u(Matrix matrix, float[] fArr) {
        float f3 = fArr[0];
        float f4 = fArr[1];
        float f5 = fArr[2];
        float f6 = fArr[3];
        float f7 = fArr[4];
        float f8 = fArr[5];
        float f9 = fArr[6];
        float f10 = fArr[7];
        float f11 = fArr[8];
        float f12 = fArr[12];
        float f13 = fArr[13];
        float f14 = fArr[15];
        fArr[0] = f3;
        fArr[1] = f7;
        fArr[2] = f12;
        fArr[3] = f4;
        fArr[4] = f8;
        fArr[5] = f13;
        fArr[6] = f6;
        fArr[7] = f10;
        fArr[8] = f14;
        matrix.setValues(fArr);
        fArr[0] = f3;
        fArr[1] = f4;
        fArr[2] = f5;
        fArr[3] = f6;
        fArr[4] = f7;
        fArr[5] = f8;
        fArr[6] = f9;
        fArr[7] = f10;
        fArr[8] = f11;
    }

    public static final void v(Matrix matrix, float[] fArr) {
        matrix.getValues(fArr);
        float f3 = fArr[0];
        float f4 = fArr[1];
        float f5 = fArr[2];
        float f6 = fArr[3];
        float f7 = fArr[4];
        float f8 = fArr[5];
        float f9 = fArr[6];
        float f10 = fArr[7];
        float f11 = fArr[8];
        fArr[0] = f3;
        fArr[1] = f6;
        fArr[2] = 0.0f;
        fArr[3] = f9;
        fArr[4] = f4;
        fArr[5] = f7;
        fArr[6] = 0.0f;
        fArr[7] = f10;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 1.0f;
        fArr[11] = 0.0f;
        fArr[12] = f5;
        fArr[13] = f8;
        fArr[14] = 0.0f;
        fArr[15] = f11;
    }

    public static final BlendMode w(int i2) {
        BlendMode blendMode;
        BlendMode blendMode2;
        BlendMode blendMode3;
        BlendMode blendMode4;
        BlendMode blendMode5;
        BlendMode blendMode6;
        BlendMode blendMode7;
        BlendMode blendMode8;
        BlendMode blendMode9;
        BlendMode blendMode10;
        BlendMode blendMode11;
        BlendMode blendMode12;
        BlendMode blendMode13;
        BlendMode blendMode14;
        BlendMode blendMode15;
        BlendMode blendMode16;
        BlendMode blendMode17;
        BlendMode blendMode18;
        BlendMode blendMode19;
        BlendMode blendMode20;
        BlendMode blendMode21;
        BlendMode blendMode22;
        BlendMode blendMode23;
        BlendMode blendMode24;
        BlendMode blendMode25;
        BlendMode blendMode26;
        BlendMode blendMode27;
        BlendMode blendMode28;
        BlendMode blendMode29;
        BlendMode blendMode30;
        if (m(i2, 0)) {
            blendMode30 = BlendMode.CLEAR;
            return blendMode30;
        }
        if (m(i2, 1)) {
            blendMode29 = BlendMode.SRC;
            return blendMode29;
        }
        if (m(i2, 2)) {
            blendMode28 = BlendMode.DST;
            return blendMode28;
        }
        if (m(i2, 3)) {
            blendMode27 = BlendMode.SRC_OVER;
            return blendMode27;
        }
        if (m(i2, 4)) {
            blendMode26 = BlendMode.DST_OVER;
            return blendMode26;
        }
        if (m(i2, 5)) {
            blendMode25 = BlendMode.SRC_IN;
            return blendMode25;
        }
        if (m(i2, 6)) {
            blendMode24 = BlendMode.DST_IN;
            return blendMode24;
        }
        if (m(i2, 7)) {
            blendMode23 = BlendMode.SRC_OUT;
            return blendMode23;
        }
        if (m(i2, 8)) {
            blendMode22 = BlendMode.DST_OUT;
            return blendMode22;
        }
        if (m(i2, 9)) {
            blendMode21 = BlendMode.SRC_ATOP;
            return blendMode21;
        }
        if (m(i2, 10)) {
            blendMode20 = BlendMode.DST_ATOP;
            return blendMode20;
        }
        if (m(i2, 11)) {
            blendMode19 = BlendMode.XOR;
            return blendMode19;
        }
        if (m(i2, 12)) {
            blendMode18 = BlendMode.PLUS;
            return blendMode18;
        }
        if (m(i2, 13)) {
            blendMode17 = BlendMode.MODULATE;
            return blendMode17;
        }
        if (m(i2, 14)) {
            blendMode16 = BlendMode.SCREEN;
            return blendMode16;
        }
        if (m(i2, 15)) {
            blendMode15 = BlendMode.OVERLAY;
            return blendMode15;
        }
        if (m(i2, 16)) {
            blendMode14 = BlendMode.DARKEN;
            return blendMode14;
        }
        if (m(i2, 17)) {
            blendMode13 = BlendMode.LIGHTEN;
            return blendMode13;
        }
        if (m(i2, 18)) {
            blendMode12 = BlendMode.COLOR_DODGE;
            return blendMode12;
        }
        if (m(i2, 19)) {
            blendMode11 = BlendMode.COLOR_BURN;
            return blendMode11;
        }
        if (m(i2, 20)) {
            blendMode10 = BlendMode.HARD_LIGHT;
            return blendMode10;
        }
        if (m(i2, 21)) {
            blendMode9 = BlendMode.SOFT_LIGHT;
            return blendMode9;
        }
        if (m(i2, 22)) {
            blendMode8 = BlendMode.DIFFERENCE;
            return blendMode8;
        }
        if (m(i2, 23)) {
            blendMode7 = BlendMode.EXCLUSION;
            return blendMode7;
        }
        if (m(i2, 24)) {
            blendMode6 = BlendMode.MULTIPLY;
            return blendMode6;
        }
        if (m(i2, 25)) {
            blendMode5 = BlendMode.HUE;
            return blendMode5;
        }
        if (m(i2, 26)) {
            blendMode4 = BlendMode.SATURATION;
            return blendMode4;
        }
        if (m(i2, 27)) {
            blendMode3 = BlendMode.COLOR;
            return blendMode3;
        }
        if (m(i2, 28)) {
            blendMode2 = BlendMode.LUMINOSITY;
            return blendMode2;
        }
        blendMode = BlendMode.SRC_OVER;
        return blendMode;
    }

    public static final Rect x(O0.i iVar) {
        return new Rect(iVar.f5143a, iVar.f5144b, iVar.f5145c, iVar.f5146d);
    }

    public static final Rect y(b0.d dVar) {
        return new Rect((int) dVar.f7060a, (int) dVar.f7061b, (int) dVar.f7062c, (int) dVar.f7063d);
    }

    public static final RectF z(b0.d dVar) {
        return new RectF(dVar.f7060a, dVar.f7061b, dVar.f7062c, dVar.f7063d);
    }
}
