package W2;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class x extends z2.i implements y2.a {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f6164i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ y f6165j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(y yVar, int i2) {
        super(0);
        this.f6164i = i2;
        this.f6165j = yVar;
    }

    @Override // y2.a
    public final Object c() {
        y yVar = this.f6165j;
        switch (this.f6164i) {
            case 0:
                return Integer.valueOf(w.d(yVar, (U2.f[]) yVar.f6175j.getValue()));
            case 1:
                C0414o c0414o = yVar.f6167b;
                return c0414o != null ? new T2.a[]{(T2.a) c0414o.f6152b} : w.f6163b;
            default:
                return w.c(yVar.f6167b != null ? new ArrayList(0) : null);
        }
    }
}
