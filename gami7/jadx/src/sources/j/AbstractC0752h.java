package j;

import n2.AbstractC0959k;

/* renamed from: j.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0752h {

    /* renamed from: a, reason: collision with root package name */
    public static final float[] f8003a;

    static {
        long[] jArr = AbstractC0739E.f7971a;
        int d3 = AbstractC0739E.d(0);
        int max = d3 > 0 ? Math.max(7, AbstractC0739E.c(d3)) : 0;
        if (max != 0) {
            jArr = new long[((max + 15) & (-8)) >> 3];
            AbstractC0959k.v(jArr);
        }
        int i2 = max >> 3;
        long j3 = 255 << ((max & 7) << 3);
        jArr[i2] = (jArr[i2] & (~j3)) | j3;
        float[] fArr = new float[max];
        f8003a = new float[0];
    }
}
