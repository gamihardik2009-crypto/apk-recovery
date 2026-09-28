package G2;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class k implements g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1267a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1268b;

    public /* synthetic */ k(int i2, Object obj) {
        this.f1267a = i2;
        this.f1268b = obj;
    }

    @Override // G2.g
    public final Iterator iterator() {
        switch (this.f1267a) {
            case 0:
                return (Iterator) this.f1268b;
            default:
                return ((Iterable) this.f1268b).iterator();
        }
    }
}
