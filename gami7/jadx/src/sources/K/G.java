package K;

import D.C0046o;
import J.C0292u;
import J.G0;
import J.InterfaceC0259d;

/* loaded from: classes.dex */
public abstract class G {

    /* renamed from: a, reason: collision with root package name */
    public final int f4447a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4448b;

    public G(int i2, int i3) {
        this.f4447a = i2;
        this.f4448b = i3;
    }

    public abstract void a(C0046o c0046o, InterfaceC0259d interfaceC0259d, G0 g02, C0292u c0292u);

    public String b(int i2) {
        return "IntParameter(" + i2 + ')';
    }

    public String c(int i2) {
        return "ObjectParameter(" + i2 + ')';
    }

    public final String toString() {
        String b3 = z2.t.a(getClass()).b();
        return b3 == null ? "" : b3;
    }

    public /* synthetic */ G(int i2, int i3, int i4) {
        this((i4 & 1) != 0 ? 0 : i2, (i4 & 2) != 0 ? 0 : i3);
    }
}
