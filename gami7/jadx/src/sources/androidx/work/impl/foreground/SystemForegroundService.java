package androidx.work.impl.foreground;

import B1.F;
import B1.s;
import C1.w;
import J1.b;
import J1.c;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.lifecycle.AbstractServiceC0473w;
import java.util.UUID;

/* loaded from: classes.dex */
public class SystemForegroundService extends AbstractServiceC0473w implements b {

    /* renamed from: m, reason: collision with root package name */
    public static final String f6959m = s.f("SystemFgService");

    /* renamed from: i, reason: collision with root package name */
    public Handler f6960i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f6961j;

    /* renamed from: k, reason: collision with root package name */
    public c f6962k;

    /* renamed from: l, reason: collision with root package name */
    public NotificationManager f6963l;

    public final void a() {
        this.f6960i = new Handler(Looper.getMainLooper());
        this.f6963l = (NotificationManager) getApplicationContext().getSystemService("notification");
        c cVar = new c(getApplicationContext());
        this.f6962k = cVar;
        if (cVar.f4334p != null) {
            s.d().b(c.q, "A callback already exists.");
        } else {
            cVar.f4334p = this;
        }
    }

    @Override // androidx.lifecycle.AbstractServiceC0473w, android.app.Service
    public final void onCreate() {
        super.onCreate();
        a();
    }

    @Override // androidx.lifecycle.AbstractServiceC0473w, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.f6962k.f();
    }

    @Override // androidx.lifecycle.AbstractServiceC0473w, android.app.Service
    public final int onStartCommand(Intent intent, int i2, int i3) {
        super.onStartCommand(intent, i2, i3);
        boolean z3 = this.f6961j;
        String str = f6959m;
        if (z3) {
            s.d().e(str, "Re-initializing SystemForegroundService after a request to shut-down.");
            this.f6962k.f();
            a();
            this.f6961j = false;
        }
        if (intent == null) {
            return 3;
        }
        c cVar = this.f6962k;
        cVar.getClass();
        String action = intent.getAction();
        boolean equals = "ACTION_START_FOREGROUND".equals(action);
        String str2 = c.q;
        if (equals) {
            s.d().e(str2, "Started foreground service " + intent);
            cVar.f4327i.a(new F(cVar, 4, intent.getStringExtra("KEY_WORKSPEC_ID")));
            cVar.d(intent);
            return 3;
        }
        if ("ACTION_NOTIFY".equals(action)) {
            cVar.d(intent);
            return 3;
        }
        if (!"ACTION_CANCEL_WORK".equals(action)) {
            if (!"ACTION_STOP_FOREGROUND".equals(action)) {
                return 3;
            }
            s.d().e(str2, "Stopping foreground service");
            b bVar = cVar.f4334p;
            if (bVar == null) {
                return 3;
            }
            SystemForegroundService systemForegroundService = (SystemForegroundService) bVar;
            systemForegroundService.f6961j = true;
            s.d().a(str, "All commands completed.");
            systemForegroundService.stopForeground(true);
            systemForegroundService.stopSelf();
            return 3;
        }
        s.d().e(str2, "Stopping foreground work for " + intent);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        if (stringExtra == null || TextUtils.isEmpty(stringExtra)) {
            return 3;
        }
        UUID fromString = UUID.fromString(stringExtra);
        w wVar = cVar.f4326h;
        wVar.getClass();
        wVar.f691i.a(new L1.b(wVar, fromString));
        return 3;
    }
}
