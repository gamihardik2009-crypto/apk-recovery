package H;

import J.InterfaceC0258c0;
import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import m2.C0880v;

/* renamed from: H.w0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0213w0 extends z2.i implements y2.c {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f3243i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0258c0 f3244j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0213w0(InterfaceC0258c0 interfaceC0258c0, int i2) {
        super(1);
        this.f3243i = i2;
        this.f3244j = interfaceC0258c0;
    }

    @Override // y2.c
    public final Object l(Object obj) {
        C0880v c0880v = C0880v.f8657a;
        InterfaceC0258c0 interfaceC0258c0 = this.f3244j;
        switch (this.f3243i) {
            case 0:
                A0.k kVar = (A0.k) obj;
                if (!H2.l.V((CharSequence) interfaceC0258c0.getValue())) {
                    String str = (String) interfaceC0258c0.getValue();
                    F2.d[] dVarArr = A0.w.f123a;
                    kVar.e(A0.t.f93D, str);
                    break;
                }
                break;
            case 1:
                float f3 = K5.f1682a;
                interfaceC0258c0.setValue((I0.z) obj);
                break;
            case 2:
                float f4 = K5.f1682a;
                interfaceC0258c0.setValue((I0.z) obj);
                break;
            default:
                Configuration configuration = new Configuration((Configuration) obj);
                J.B b3 = AndroidCompositionLocals_androidKt.f6780a;
                interfaceC0258c0.setValue(configuration);
                break;
        }
        return c0880v;
    }
}
