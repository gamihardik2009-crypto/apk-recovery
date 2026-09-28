package G2;

import java.util.Iterator;
import m2.InterfaceC0861c;

/* loaded from: classes.dex */
public final class f implements g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1261a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1262b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0861c f1263c;

    public /* synthetic */ f(Object obj, InterfaceC0861c interfaceC0861c, int i2) {
        this.f1261a = i2;
        this.f1262b = obj;
        this.f1263c = interfaceC0861c;
    }

    @Override // G2.g
    public final Iterator iterator() {
        switch (this.f1261a) {
            case 0:
                return new e(this);
            default:
                return new e(this, (byte) 0);
        }
    }
}
