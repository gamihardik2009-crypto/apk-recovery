package b1;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import s.RunnableC1149B;

/* renamed from: b1.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnApplyWindowInsetsListenerC0534k implements View.OnApplyWindowInsetsListener {

    /* renamed from: a, reason: collision with root package name */
    public C0521S f7125a = null;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f7126b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0529f f7127c;

    public ViewOnApplyWindowInsetsListenerC0534k(View view, InterfaceC0529f interfaceC0529f) {
        this.f7126b = view;
        this.f7127c = interfaceC0529f;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        C0521S b3 = C0521S.b(view, windowInsets);
        int i2 = Build.VERSION.SDK_INT;
        InterfaceC0529f interfaceC0529f = this.f7127c;
        if (i2 < 30) {
            AbstractC0535l.a(windowInsets, this.f7126b);
            if (b3.equals(this.f7125a)) {
                return ((RunnableC1149B) interfaceC0529f).a(view, b3).a();
            }
        }
        this.f7125a = b3;
        C0521S a3 = ((RunnableC1149B) interfaceC0529f).a(view, b3);
        if (i2 >= 30) {
            return a3.a();
        }
        int i3 = AbstractC0542s.f7132a;
        AbstractC0533j.c(view);
        return a3.a();
    }
}
