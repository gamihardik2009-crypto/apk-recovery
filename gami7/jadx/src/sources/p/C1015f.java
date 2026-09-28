package p;

import J.C0257c;
import J.InterfaceC0282o0;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import n0.AbstractC0937p;

/* renamed from: p.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1015f extends z2.i implements y2.c {

    /* renamed from: j, reason: collision with root package name */
    public static final C1015f f9594j = new C1015f(1, 0);

    /* renamed from: k, reason: collision with root package name */
    public static final C1015f f9595k = new C1015f(1, 1);

    /* renamed from: l, reason: collision with root package name */
    public static final C1015f f9596l = new C1015f(1, 2);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f9597i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1015f(int i2, int i3) {
        super(i2);
        this.f9597i = i3;
    }

    @Override // y2.c
    public final Object l(Object obj) {
        switch (this.f9597i) {
            case 0:
                InterfaceC0282o0 interfaceC0282o0 = (InterfaceC0282o0) obj;
                J.X0 x02 = AndroidCompositionLocals_androidKt.f6781b;
                interfaceC0282o0.getClass();
                if (((Context) C0257c.P(interfaceC0282o0, x02)).getPackageManager().hasSystemFeature("android.software.leanback")) {
                    return AbstractC1019h.f9600b;
                }
                InterfaceC1013e.f9585a.getClass();
                return C1011d.f9578c;
            case 1:
                return Boolean.TRUE;
            default:
                return Boolean.valueOf(!AbstractC0937p.e(((n0.r) obj).f8965i, 2));
        }
    }
}
