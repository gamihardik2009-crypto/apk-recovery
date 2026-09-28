package O;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public int f5120a;

    /* renamed from: b, reason: collision with root package name */
    public Object f5121b;

    public /* synthetic */ m(int i2, Object obj) {
        this.f5120a = i2;
        this.f5121b = obj;
    }

    public void a(long j3) {
        if (b(j3)) {
            return;
        }
        int i2 = this.f5120a;
        long[] jArr = (long[]) this.f5121b;
        if (i2 >= jArr.length) {
            long[] copyOf = Arrays.copyOf(jArr, Math.max(i2 + 1, jArr.length * 2));
            z2.h.e(copyOf, "copyOf(this, newSize)");
            this.f5121b = copyOf;
        }
        ((long[]) this.f5121b)[i2] = j3;
        if (i2 >= this.f5120a) {
            this.f5120a = i2 + 1;
        }
    }

    public boolean b(long j3) {
        int i2 = this.f5120a;
        for (int i3 = 0; i3 < i2; i3++) {
            if (((long[]) this.f5121b)[i3] == j3) {
                return true;
            }
        }
        return false;
    }

    public void c(int i2) {
        int i3 = this.f5120a;
        if (i2 < i3) {
            int i4 = i3 - 1;
            while (i2 < i4) {
                long[] jArr = (long[]) this.f5121b;
                int i5 = i2 + 1;
                jArr[i2] = jArr[i5];
                i2 = i5;
            }
            this.f5120a--;
        }
    }

    public m(n nVar, int i2) {
        this.f5121b = nVar;
        this.f5120a = i2;
    }
}
