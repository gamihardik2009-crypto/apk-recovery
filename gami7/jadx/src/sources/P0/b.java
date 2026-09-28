package P0;

import j.AbstractC0758n;
import j.C0742H;
import k.AbstractC0779a;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final float[] f5225a = {8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f};

    /* renamed from: b, reason: collision with root package name */
    public static volatile C0742H f5226b = new C0742H();

    /* renamed from: c, reason: collision with root package name */
    public static final Object[] f5227c;

    static {
        Object[] objArr = new Object[0];
        f5227c = objArr;
        synchronized (objArr) {
            f5226b.e((int) 115.0f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{9.2f, 11.5f, 13.8f, 16.4f, 19.8f, 21.8f, 25.2f, 30.0f, 100.0f}));
            f5226b.e((int) 130.0f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{10.4f, 13.0f, 15.6f, 18.8f, 21.6f, 23.6f, 26.4f, 30.0f, 100.0f}));
            f5226b.e((int) 150.0f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{12.0f, 15.0f, 18.0f, 22.0f, 24.0f, 26.0f, 28.0f, 30.0f, 100.0f}));
            f5226b.e((int) 180.0f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{14.4f, 18.0f, 21.6f, 24.4f, 27.6f, 30.8f, 32.8f, 34.8f, 100.0f}));
            f5226b.e((int) 200.0f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{16.0f, 20.0f, 24.0f, 26.0f, 30.0f, 34.0f, 36.0f, 38.0f, 100.0f}));
        }
        if ((f5226b.d(0) / 100.0f) - 0.01f <= 1.03f) {
            throw new IllegalStateException("You should only apply non-linear scaling to font scales > 1");
        }
    }

    public static a a(float f3) {
        float d3;
        a aVar;
        if (f3 < 1.03f) {
            return null;
        }
        int i2 = (int) (f3 * 100.0f);
        a aVar2 = (a) f5226b.c(i2);
        if (aVar2 != null) {
            return aVar2;
        }
        C0742H c0742h = f5226b;
        if (c0742h.f7976h) {
            AbstractC0758n.a(c0742h);
        }
        int a3 = AbstractC0779a.a(c0742h.f7977i, c0742h.f7979k, i2);
        if (a3 >= 0) {
            return (a) f5226b.g(a3);
        }
        int i3 = -(a3 + 1);
        int i4 = i3 - 1;
        if (i3 >= f5226b.f()) {
            c cVar = new c(new float[]{1.0f}, new float[]{f3});
            b(f3, cVar);
            return cVar;
        }
        float[] fArr = f5225a;
        if (i4 < 0) {
            aVar = new c(fArr, fArr);
            d3 = 1.0f;
        } else {
            d3 = f5226b.d(i4) / 100.0f;
            aVar = (a) f5226b.g(i4);
        }
        float d4 = f5226b.d(i3) / 100.0f;
        float max = (Math.max(0.0f, Math.min(1.0f, d3 == d4 ? 0.0f : (f3 - d3) / (d4 - d3))) * 1.0f) + 0.0f;
        a aVar3 = (a) f5226b.g(i3);
        float[] fArr2 = new float[9];
        for (int i5 = 0; i5 < 9; i5++) {
            float f4 = fArr[i5];
            float b3 = aVar.b(f4);
            fArr2[i5] = ((aVar3.b(f4) - b3) * max) + b3;
        }
        c cVar2 = new c(fArr, fArr2);
        b(f3, cVar2);
        return cVar2;
    }

    public static void b(float f3, c cVar) {
        synchronized (f5227c) {
            C0742H clone = f5226b.clone();
            clone.e((int) (f3 * 100.0f), cVar);
            f5226b = clone;
        }
    }
}
