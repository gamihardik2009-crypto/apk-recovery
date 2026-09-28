package P0;

import java.util.Arrays;
import z2.h;

/* loaded from: classes.dex */
public final class c implements a {

    /* renamed from: a, reason: collision with root package name */
    public final float[] f5228a;

    /* renamed from: b, reason: collision with root package name */
    public final float[] f5229b;

    public c(float[] fArr, float[] fArr2) {
        if (fArr.length != fArr2.length || fArr.length == 0) {
            throw new IllegalArgumentException("Array lengths must match and be nonzero".toString());
        }
        this.f5228a = fArr;
        this.f5229b = fArr2;
    }

    @Override // P0.a
    public final float a(float f3) {
        return C1.b.a(f3, this.f5229b, this.f5228a);
    }

    @Override // P0.a
    public final float b(float f3) {
        return C1.b.a(f3, this.f5228a, this.f5229b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Arrays.equals(this.f5228a, cVar.f5228a) && Arrays.equals(this.f5229b, cVar.f5229b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f5229b) + (Arrays.hashCode(this.f5228a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FontScaleConverter{fromSpValues=");
        String arrays = Arrays.toString(this.f5228a);
        h.e(arrays, "toString(this)");
        sb.append(arrays);
        sb.append(", toDpValues=");
        String arrays2 = Arrays.toString(this.f5229b);
        h.e(arrays2, "toString(this)");
        sb.append(arrays2);
        sb.append('}');
        return sb.toString();
    }
}
