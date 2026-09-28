package F1;

import B1.s;
import B1.u;
import android.content.ComponentName;
import android.content.Context;
import androidx.work.impl.background.systemjob.SystemJobService;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: c, reason: collision with root package name */
    public static final String f1114c = s.f("SystemJobInfoConverter");

    /* renamed from: a, reason: collision with root package name */
    public final ComponentName f1115a;

    /* renamed from: b, reason: collision with root package name */
    public final u f1116b;

    public a(Context context, u uVar) {
        this.f1116b = uVar;
        this.f1115a = new ComponentName(context.getApplicationContext(), (Class<?>) SystemJobService.class);
    }
}
