package c0;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.os.Build;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: c0.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0564D extends AbstractC0574N {

    /* renamed from: c, reason: collision with root package name */
    public final List f7183c;

    /* renamed from: d, reason: collision with root package name */
    public final List f7184d;

    /* renamed from: e, reason: collision with root package name */
    public final long f7185e;

    /* renamed from: f, reason: collision with root package name */
    public final long f7186f;

    /* renamed from: g, reason: collision with root package name */
    public final int f7187g;

    public C0564D(List list, ArrayList arrayList, long j3, long j4, int i2) {
        this.f7183c = list;
        this.f7184d = arrayList;
        this.f7185e = j3;
        this.f7186f = j4;
        this.f7187g = i2;
    }

    @Override // c0.AbstractC0574N
    public final Shader b(long j3) {
        float[] fArr;
        long j4 = this.f7185e;
        float d3 = b0.c.d(j4) == Float.POSITIVE_INFINITY ? b0.f.d(j3) : b0.c.d(j4);
        float b3 = b0.c.e(j4) == Float.POSITIVE_INFINITY ? b0.f.b(j3) : b0.c.e(j4);
        long j5 = this.f7186f;
        float d4 = b0.c.d(j5) == Float.POSITIVE_INFINITY ? b0.f.d(j3) : b0.c.d(j5);
        float b4 = b0.c.e(j5) == Float.POSITIVE_INFINITY ? b0.f.b(j3) : b0.c.e(j5);
        long e3 = K1.f.e(d3, b3);
        long e4 = K1.f.e(d4, b4);
        List list = this.f7183c;
        List list2 = this.f7184d;
        if (list2 == null) {
            if (list.size() < 2) {
                throw new IllegalArgumentException("colors must have length of at least 2 if colorStops is omitted.");
            }
        } else if (list.size() != list2.size()) {
            throw new IllegalArgumentException("colors and colorStops arguments must have equal length.");
        }
        float d5 = b0.c.d(e3);
        float e5 = b0.c.e(e3);
        float d6 = b0.c.d(e4);
        float e6 = b0.c.e(e4);
        int size = list.size();
        int[] iArr = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr[i2] = AbstractC0571K.A(((C0603v) list.get(i2)).f7279a);
        }
        if (list2 != null) {
            fArr = new float[list2.size()];
            Iterator it = list2.iterator();
            int i3 = 0;
            while (it.hasNext()) {
                fArr[i3] = ((Number) it.next()).floatValue();
                i3++;
            }
        } else {
            fArr = null;
        }
        float[] fArr2 = fArr;
        int i4 = this.f7187g;
        return new LinearGradient(d5, e5, d6, e6, iArr, fArr2, AbstractC0571K.q(i4, 0) ? Shader.TileMode.CLAMP : AbstractC0571K.q(i4, 1) ? Shader.TileMode.REPEAT : AbstractC0571K.q(i4, 2) ? Shader.TileMode.MIRROR : AbstractC0571K.q(i4, 3) ? Build.VERSION.SDK_INT >= 31 ? C0579T.f7239a.b() : Shader.TileMode.CLAMP : Shader.TileMode.CLAMP);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0564D)) {
            return false;
        }
        C0564D c0564d = (C0564D) obj;
        return z2.h.a(this.f7183c, c0564d.f7183c) && z2.h.a(this.f7184d, c0564d.f7184d) && b0.c.b(this.f7185e, c0564d.f7185e) && b0.c.b(this.f7186f, c0564d.f7186f) && AbstractC0571K.q(this.f7187g, c0564d.f7187g);
    }

    public final int hashCode() {
        int hashCode = this.f7183c.hashCode() * 31;
        List list = this.f7184d;
        return Integer.hashCode(this.f7187g) + B1.t.d(B1.t.d((hashCode + (list != null ? list.hashCode() : 0)) * 31, 31, this.f7185e), 31, this.f7186f);
    }

    public final String toString() {
        String str;
        long j3 = this.f7185e;
        String str2 = "";
        if (K1.f.E(j3)) {
            str = "start=" + ((Object) b0.c.j(j3)) + ", ";
        } else {
            str = "";
        }
        long j4 = this.f7186f;
        if (K1.f.E(j4)) {
            str2 = "end=" + ((Object) b0.c.j(j4)) + ", ";
        }
        StringBuilder sb = new StringBuilder("LinearGradient(colors=");
        sb.append(this.f7183c);
        sb.append(", stops=");
        sb.append(this.f7184d);
        sb.append(", ");
        sb.append(str);
        sb.append(str2);
        sb.append("tileMode=");
        int i2 = this.f7187g;
        sb.append((Object) (AbstractC0571K.q(i2, 0) ? "Clamp" : AbstractC0571K.q(i2, 1) ? "Repeated" : AbstractC0571K.q(i2, 2) ? "Mirror" : AbstractC0571K.q(i2, 3) ? "Decal" : "Unknown"));
        sb.append(')');
        return sb.toString();
    }
}
