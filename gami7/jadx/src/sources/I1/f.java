package I1;

import C1.z;
import android.content.Context;
import java.util.LinkedHashSet;
import n2.AbstractC0961m;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public final N1.b f3942a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f3943b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f3944c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashSet f3945d;

    /* renamed from: e, reason: collision with root package name */
    public Object f3946e;

    public f(Context context, N1.b bVar) {
        z2.h.f(bVar, "taskExecutor");
        this.f3942a = bVar;
        Context applicationContext = context.getApplicationContext();
        z2.h.e(applicationContext, "context.applicationContext");
        this.f3943b = applicationContext;
        this.f3944c = new Object();
        this.f3945d = new LinkedHashSet();
    }

    public abstract Object a();

    public final void b(Object obj) {
        synchronized (this.f3944c) {
            Object obj2 = this.f3946e;
            if (obj2 == null || !z2.h.a(obj2, obj)) {
                this.f3946e = obj;
                this.f3942a.f5013d.execute(new z(AbstractC0961m.X(this.f3945d), 2, this));
            }
        }
    }

    public abstract void c();

    public abstract void d();
}
