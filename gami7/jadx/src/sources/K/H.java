package K;

import D.C0046o;
import J.C0257c;
import J.C0292u;
import J.G0;
import J.InterfaceC0259d;
import java.util.Arrays;
import n2.AbstractC0959k;

/* loaded from: classes.dex */
public final class H extends B2.a {

    /* renamed from: i, reason: collision with root package name */
    public int f4450i;

    /* renamed from: k, reason: collision with root package name */
    public int f4452k;

    /* renamed from: m, reason: collision with root package name */
    public int f4454m;

    /* renamed from: n, reason: collision with root package name */
    public int f4455n;

    /* renamed from: o, reason: collision with root package name */
    public int f4456o;

    /* renamed from: h, reason: collision with root package name */
    public G[] f4449h = new G[16];

    /* renamed from: j, reason: collision with root package name */
    public int[] f4451j = new int[16];

    /* renamed from: l, reason: collision with root package name */
    public Object[] f4453l = new Object[16];

    public static final int I(H h2, int i2) {
        if (i2 == 0) {
            return 0;
        }
        return (-1) >>> (32 - i2);
    }

    public final void J() {
        this.f4450i = 0;
        this.f4452k = 0;
        AbstractC0959k.u(this.f4453l, null, 0, this.f4454m);
        this.f4454m = 0;
    }

    public final void K(InterfaceC0259d interfaceC0259d, G0 g02, C0292u c0292u) {
        H h2;
        int i2;
        if (M()) {
            C0046o c0046o = new C0046o(this);
            do {
                h2 = (H) c0046o.f875e;
                G g3 = h2.f4449h[c0046o.f872b];
                z2.h.c(g3);
                g3.a(c0046o, interfaceC0259d, g02, c0292u);
                int i3 = c0046o.f872b;
                if (i3 >= h2.f4450i) {
                    break;
                }
                G g4 = h2.f4449h[i3];
                z2.h.c(g4);
                c0046o.f873c += g4.f4447a;
                c0046o.f874d += g4.f4448b;
                i2 = c0046o.f872b + 1;
                c0046o.f872b = i2;
            } while (i2 < h2.f4450i);
        }
        J();
    }

    public final boolean L() {
        return this.f4450i == 0;
    }

    public final boolean M() {
        return this.f4450i != 0;
    }

    public final G N() {
        G g3 = this.f4449h[this.f4450i - 1];
        z2.h.c(g3);
        return g3;
    }

    public final void O(G g3) {
        int i2 = g3.f4447a;
        int i3 = g3.f4448b;
        if (i2 == 0 && i3 == 0) {
            P(g3);
            return;
        }
        C0257c.W("Cannot push " + g3 + " without arguments because it expects " + i2 + " ints and " + i3 + " objects.");
        throw null;
    }

    public final void P(G g3) {
        this.f4455n = 0;
        this.f4456o = 0;
        int i2 = this.f4450i;
        G[] gArr = this.f4449h;
        if (i2 == gArr.length) {
            Object[] copyOf = Arrays.copyOf(gArr, i2 + (i2 > 1024 ? 1024 : i2));
            z2.h.e(copyOf, "copyOf(this, newSize)");
            this.f4449h = (G[]) copyOf;
        }
        int i3 = this.f4452k;
        int i4 = g3.f4447a;
        int i5 = i3 + i4;
        int[] iArr = this.f4451j;
        int length = iArr.length;
        if (i5 > length) {
            int i6 = length + (length > 1024 ? 1024 : length);
            if (i6 >= i5) {
                i5 = i6;
            }
            int[] copyOf2 = Arrays.copyOf(iArr, i5);
            z2.h.e(copyOf2, "copyOf(this, newSize)");
            this.f4451j = copyOf2;
        }
        int i7 = this.f4454m;
        int i8 = g3.f4448b;
        int i9 = i7 + i8;
        Object[] objArr = this.f4453l;
        int length2 = objArr.length;
        if (i9 > length2) {
            int i10 = length2 + (length2 <= 1024 ? length2 : 1024);
            if (i10 >= i9) {
                i9 = i10;
            }
            Object[] copyOf3 = Arrays.copyOf(objArr, i9);
            z2.h.e(copyOf3, "copyOf(this, newSize)");
            this.f4453l = copyOf3;
        }
        G[] gArr2 = this.f4449h;
        int i11 = this.f4450i;
        this.f4450i = i11 + 1;
        gArr2[i11] = g3;
        this.f4452k += i4;
        this.f4454m += i8;
    }

    public final String toString() {
        return super.toString();
    }
}
