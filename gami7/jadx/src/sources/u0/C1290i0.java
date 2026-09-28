package u0;

import J.C0285q;
import android.graphics.Matrix;
import android.view.View;
import m2.C0880v;

/* renamed from: u0.i0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1290i0 extends z2.i implements y2.e {

    /* renamed from: j, reason: collision with root package name */
    public static final C1290i0 f11058j = new C1290i0(2, 0);

    /* renamed from: k, reason: collision with root package name */
    public static final C1290i0 f11059k = new C1290i0(2, 1);

    /* renamed from: l, reason: collision with root package name */
    public static final C1290i0 f11060l = new C1290i0(2, 2);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f11061i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1290i0(int i2, int i3) {
        super(i2);
        this.f11061i = i3;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        switch (this.f11061i) {
            case 0:
                C0285q c0285q = (C0285q) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0285q.A()) {
                    c0285q.P();
                }
                break;
            case 1:
                ((InterfaceC1302o0) obj).I((Matrix) obj2);
                break;
            default:
                ((Matrix) obj2).set(((View) obj).getMatrix());
                break;
        }
        return C0880v.f8657a;
    }
}
